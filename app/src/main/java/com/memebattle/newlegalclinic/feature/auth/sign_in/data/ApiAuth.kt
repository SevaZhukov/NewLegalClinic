package com.memebattle.newlegalclinic.feature.auth.sign_in.data

import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.POST

interface ApiAuth {
    @POST("kek")
    fun signIn(@Field("lol") lol: String): Call<String>
}