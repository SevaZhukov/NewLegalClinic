package com.memebattle.newlegalclinic

import android.app.Application
import com.memebattle.newlegalclinic.core.di.core.AppComponent
import com.memebattle.newlegalclinic.core.di.core.DaggerAppComponent
import com.memebattle.newlegalclinic.core.di.core.module.AppModule
import com.memebattle.newlegalclinic.core.di.core.module.RetrofitModule
import com.memebattle.newlegalclinic.core.di.sub.auth.AuthComponent
import com.memebattle.newlegalclinic.core.di.sub.auth.module.AuthApiModule
import com.memebattle.newlegalclinic.core.di.sub.auth.module.AuthSettingsModule

class App : Application() {

    companion object {
        lateinit var instance: App
    }

    lateinit var appComponent: AppComponent
    private var authComponent: AuthComponent? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(instance))
                .retrofitModule(RetrofitModule("https://www.brewmapp.com/api/"))
                .build()
    }

    fun plusFirstComponent() {
        if (authComponent == null)
            authComponent = appComponent.firstComponentBuilder()
                    .apiModule(AuthApiModule())
                    .settingsModule(AuthSettingsModule())
                    .buid()
    }

    fun removeFirstComponent() {
        authComponent = null
    }
}