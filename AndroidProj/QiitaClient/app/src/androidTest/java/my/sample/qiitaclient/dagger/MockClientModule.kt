package my.sample.qiitaclient.dagger

import dagger.Module
import dagger.Provides
import my.sample.qiitaclient.client.ArticleClient
import org.mockito.Mockito
import javax.inject.Singleton

@Module
class MockClientModule {
    @Provides
    @Singleton
    fun provideArticleClient(): ArticleClient =
            Mockito.mock(ArticleClient::class.java)
}
