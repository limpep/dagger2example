package epsolutions.biz.dagger2example

import android.app.Application
import epsolutions.biz.dagger2example.dagger.AppComponent
import epsolutions.biz.dagger2example.dagger.DaggerAppComponent


class ExampleApp: Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }


    fun getAppComponent(): AppComponent {
        return component
    }
}