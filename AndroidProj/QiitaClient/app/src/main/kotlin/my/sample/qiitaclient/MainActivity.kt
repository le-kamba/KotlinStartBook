package my.sample.qiitaclient

import android.content.Context
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.ProgressBar
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import com.trello.rxlifecycle2.kotlin.bindToLifecycle
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import my.sample.qiitaclient.adapter.ArticleListAdapter
import my.sample.qiitaclient.client.ArticleClient
import my.sample.qiitaclient.model.Article
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : RxAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)

        val listView: ListView = findViewById(R.id.list_view)
        listView.adapter = listAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val article = listAdapter.articles[position]
            ArticleActivity.intent(this, article).let { startActivity(it) }
        }

        val gson = GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create()
        val retrofit = Retrofit.Builder()
                .baseUrl("https://qiita.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        val articleClient = retrofit.create(ArticleClient::class.java)

        val queryEditText = findViewById<EditText>(R.id.query_edit_text)
        val searchButton = findViewById<Button>(R.id.search_button)
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)

        searchButton.setOnClickListener {
            progressBar.visibility = VISIBLE

            val inputMethodManager: InputMethodManager =
                    getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(listView.windowToken,
                    InputMethodManager.HIDE_NOT_ALWAYS)
            listView.requestFocus()

            articleClient.search(queryEditText.text.toString())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doAfterTerminate {
                        progressBar.visibility = GONE

                    }
                    .bindToLifecycle(this)
                    .subscribe({ list: List<Article> ->
                        queryEditText.text.clear()
                        listAdapter.articles = list
                        listAdapter.notifyDataSetChanged()
                    }, { e: Throwable ->
                        toast("エラー: $e")
                    })
        }
    }
}
