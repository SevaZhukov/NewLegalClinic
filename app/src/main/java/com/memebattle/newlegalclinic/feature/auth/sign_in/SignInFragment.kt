package com.memebattle.newlegalclinic.feature.auth.sign_in

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.memebattle.newlegalclinic.R
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sign_in.view.*

class SignInFragment : Fragment() {

    private lateinit var viewModel: SignInViewModel
    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_sign_in, container, false)
        viewModel = ViewModelProviders.of(this).get(SignInViewModel::class.java)
        navController = Navigation.findNavController(activity!!, R.id.nav_host_auth)
        viewModel.user.observe(this, Observer {
            Log.i("code", "change $it")
        })
        v.signIn.setOnClickListener {
            viewModel.signIn()
        }
        v.gotoSignUp.setOnClickListener {
            navController.navigate(R.id.signUpFragment)
        }
        return v
    }
}
