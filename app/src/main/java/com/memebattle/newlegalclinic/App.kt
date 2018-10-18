package com.memebattle.newlegalclinic

import android.app.Application
import com.memebattle.newlegalclinic.di.core.AppComponent
import com.memebattle.newlegalclinic.di.core.DaggerAppComponent
import com.memebattle.newlegalclinic.di.core.module.AppModule
import com.memebattle.newlegalclinic.di.core.module.RetrofitModule
import com.memebattle.newlegalclinic.di.sub.first.FirstComponent
import com.memebattle.newlegalclinic.di.sub.first.module.FirstModule

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    lateinit var appComponent: AppComponent
    private var firstComponent: FirstComponent? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(instance))
                .retrofitModule(RetrofitModule("https://www.brewmapp.com/api/"))
                .build()
    }

    fun plusFirstComponent() {
        if (firstComponent == null)
            firstComponent = appComponent.firstComponentBuilder()
                    .firstModule(FirstModule())
                    .buid()
    }

    fun removeFirstComponent() {
        firstComponent = null
    }
}