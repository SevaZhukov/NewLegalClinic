package com.memebattle.newlegalclinic.core.di.sub.auth.module

import android.content.SharedPreferences
import com.memebattle.newlegalclinic.core.di.sub.auth.scope.AuthScope
import com.memebattle.newlegalclinic.feature.auth.core.domain.AuthSettingsService
import dagger.Module
import dagger.Provides

@Module
class AuthSettingsModule {
    @AuthScope
    @Provides
    fun provideAuthSettingsService(sharedPreferences: SharedPreferences): AuthSettingsService {
        return AuthSettingsService(sharedPreferences)
    }
}