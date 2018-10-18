package com.memebattle.newlegalclinic.di.core

import com.memebattle.newlegalclinic.di.core.module.AppModule
import com.memebattle.newlegalclinic.di.core.module.RetrofitModule
import com.memebattle.newlegalclinic.di.sub.first.FirstComponent
import com.memebattle.newlegalclinic.di.sub.first.module.FirstModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, RetrofitModule::class])
interface AppComponent {
    fun firstComponentBuilder(): FirstComponent.Builder
}