package com.memebattle.newlegalclinic.feature.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.memebattle.newlegalclinic.App
import com.memebattle.newlegalclinic.R

class AuthActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        App.instance.plusAuthComponent()
        navController = Navigation.findNavController(this, R.id.nav_host_auth)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.instance.removeAuthComponent()
    }
}
