package com.memebattle.newlegalclinic.core.di.sub.auth.module

import android.content.SharedPreferences
import com.memebattle.newlegalclinic.core.di.sub.auth.scope.AuthScope
import com.memebattle.newlegalclinic.feature.auth.sign_in.domain.AuthSettingsService
import dagger.Provides

class AuthSettingsModule {
    @AuthScope
    @Provides
    fun provideAuthSettingsService(sharedPreferences: SharedPreferences): AuthSettingsService {
        return AuthSettingsService(sharedPreferences)
    }
}