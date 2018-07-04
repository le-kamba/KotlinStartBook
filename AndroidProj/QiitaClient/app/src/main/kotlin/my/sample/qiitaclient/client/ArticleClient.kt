package my.sample.qiitaclient.client

import io.reactivex.Observable
import my.sample.qiitaclient.model.Article
import retrofit2.http.GET
import retrofit2.http.Query

interface ArticleClient {
    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
