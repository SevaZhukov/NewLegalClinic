package com.memebattle.newlegalclinic.core.di.sub.auth.module

import com.memebattle.newlegalclinic.core.di.sub.auth.scope.AuthScope
import com.memebattle.newlegalclinic.feature.auth.sign_in.data.ApiAuth
import com.memebattle.newlegalclinic.feature.auth.sign_in.domain.AuthApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AuthApiModule {

    @AuthScope
    @Provides
    fun provideAuthApiService(retrofit: Retrofit): AuthApiService {
        val api = retrofit.create(ApiAuth::class.java)
        return AuthApiService(api)
    }
}