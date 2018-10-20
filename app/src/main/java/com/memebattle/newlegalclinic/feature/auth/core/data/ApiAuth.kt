package com.memebattle.newlegalclinic.feature.auth.core.data

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface ApiAuth {
    @POST("kek")
    fun signIn(@Field("lol") lol: String): Call<String>

    @POST("kek")
    fun signUp(@Field("lol") lol: String): Call<String>
}