package com.core.login.app.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.viewModels
import com.core.base.fragment.BaseFragment
import com.core.login.R
import com.core.login.app.LoginVMDependency
import com.core.login.app.vm.LoginViewModel
import javax.inject.Inject

class LoginFragment : BaseFragment(R.layout.fragment_login) {

    val loginVM: LoginViewModel by viewModels {
        viewModelFactory
    }

    @Inject
    lateinit var loginVMDependency: LoginVMDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG", "fragment onCreate() called $loginVMDependency")
        loginVM.init()
    }
}