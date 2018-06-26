package my.sample.qiitaclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import my.sample.qiitaclient.model.Article
import my.sample.qiitaclient.model.User
import my.sample.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ArticleViewオブジェクトを作成
        val articleView = ArticleView(applicationContext)

        // Articleオブジェクトを作成して、ArticleViewにセット
        articleView.setArticle(Article("123",
                "Kotlin入門",
                "http://www.example.com/articles/123",
                User("456", "たろう", "")))

        // このアクティビティにArticleViewをセット
        setContentView(articleView)
    }
}
