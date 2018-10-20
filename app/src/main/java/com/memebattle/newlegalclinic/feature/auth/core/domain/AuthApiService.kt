package com.memebattle.newlegalclinic.feature.auth.core.domain

import com.memebattle.newlegalclinic.core.domain.BaseCallback
import com.memebattle.newlegalclinic.feature.auth.core.data.ApiAuth
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthApiService(var api: ApiAuth) {
    fun signIn(callback: BaseCallback<String>) {
        api.signIn("").enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                callback.onSuccess(response.body()!!)
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                callback.onError(t)
            }
        })
    }

    fun signUp(callback: BaseCallback<String>) {
        api.signUp("").enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                callback.onSuccess(response.body()!!)
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                callback.onError(t)
            }
        })
    }
}