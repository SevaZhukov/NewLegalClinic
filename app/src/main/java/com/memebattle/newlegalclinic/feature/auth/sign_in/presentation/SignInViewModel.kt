package com.memebattle.newlegalclinic.feature.auth.sign_in.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.memebattle.newlegalclinic.core.domain.BaseCallback
import com.memebattle.newlegalclinic.feature.auth.sign_in.domain.AuthApiService
import java.util.*
import javax.inject.Inject

class SignInViewModel : ViewModel() {

    @Inject
    lateinit var apiService: AuthApiService

    var user = MutableLiveData<String>()

    fun signIn() {
        apiService.signIn(object : BaseCallback<String> {
            override fun onSuccess(data: String) {
                user.value = data
            }

            override fun onError(t: Throwable) {
                user.value = Date().toString()
            }

        })
    }
}