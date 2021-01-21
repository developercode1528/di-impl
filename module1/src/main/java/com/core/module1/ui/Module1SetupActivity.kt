package com.core.module1.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.core.base.activity.BaseAppCompatActivity
import com.core.module1.R
import com.core.module1.vm.Module1SetupActivityVM

class Module1SetupActivity : BaseAppCompatActivity() {

    private val module1SetupActivityVM: Module1SetupActivityVM by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module1_setup)

        Log.d("TAG", "onCreate() called from module1 setup activity  = $module1SetupActivityVM")
    }
}