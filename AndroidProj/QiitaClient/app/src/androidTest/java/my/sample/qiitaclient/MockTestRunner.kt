package sample.qiitaclient

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner
import my.sample.qiitaclient.MockApp

class MockTestRunner : AndroidJUnitRunner() {

    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application? =
            super.newApplication(cl, MockApp::class.java.name, context)
}