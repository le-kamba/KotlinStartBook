package my.sample.qiitaclient

import android.app.Application
import my.sample.qiitaclient.dagger.AppComponent
import my.sample.qiitaclient.dagger.DaggerAppComponent

class QiitaClientApp : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}