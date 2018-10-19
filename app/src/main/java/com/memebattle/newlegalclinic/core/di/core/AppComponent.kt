package com.memebattle.newlegalclinic.core.di.core

import com.memebattle.newlegalclinic.core.di.core.module.AppModule
import com.memebattle.newlegalclinic.core.di.core.module.RetrofitModule
import com.memebattle.newlegalclinic.core.di.core.module.SharedPreferencesModule
import com.memebattle.newlegalclinic.core.di.sub.auth.AuthComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RetrofitModule::class, SharedPreferencesModule::class])
interface AppComponent {
    fun firstComponentBuilder(): AuthComponent.Builder
}