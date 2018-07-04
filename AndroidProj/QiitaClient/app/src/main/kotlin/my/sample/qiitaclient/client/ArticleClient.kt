package my.sample.qiitaclient.client

import my.sample.qiitaclient.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface ArticleClient {
    @GET
    fun search(@Query("query") query: String): Observable<List<Article>>
}
