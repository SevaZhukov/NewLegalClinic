package com.memebattle.newlegalclinic.core.di.sub.auth

import com.memebattle.newlegalclinic.core.di.sub.auth.module.AuthApiModule
import com.memebattle.newlegalclinic.core.di.sub.auth.module.AuthSettingsModule
import com.memebattle.newlegalclinic.core.di.sub.auth.scope.AuthScope
import dagger.Subcomponent

@Subcomponent(modules = [AuthApiModule::class, AuthSettingsModule::class])
@AuthScope
interface AuthComponent {
    @Subcomponent.Builder
    interface Builder {
        fun apiModule(authApiModule: AuthApiModule): AuthComponent.Builder
        fun settingsModule(authSettingsModule: AuthSettingsModule): AuthComponent.Builder
        fun buid(): AuthComponent
    }
}