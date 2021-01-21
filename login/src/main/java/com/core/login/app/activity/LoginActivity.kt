package com.core.login.app.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.core.base.activity.BaseAppCompatActivity
import com.core.login.R
import com.core.login.app.LoginVMDependency
import com.core.login.app.vm.LoginViewModel
import javax.inject.Inject

class LoginActivity : BaseAppCompatActivity() {

    @Inject
    lateinit var loginVMDependency: LoginVMDependency

    private val viewModel: LoginViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.d("TAG", "activity onCreate() called $loginVMDependency")
        viewModel.init()

    }
}