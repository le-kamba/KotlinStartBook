package my.sample.qiitaclient.dagger

import my.sample.qiitaclient.MainActivity

interface AppComponent {
    fun inject(mainActivity: MainActivity)
}