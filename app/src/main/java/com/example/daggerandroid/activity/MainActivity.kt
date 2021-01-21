package com.example.daggerandroid.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.core.base.activity.BaseAppCompatActivity
import com.core.module1.ui.Module1SetupActivity
import com.example.daggerandroid.TempClass
import com.example.daggerandroid.databinding.ActivityMainBinding
import com.example.daggerandroid.vm.MainViewModel
import javax.inject.Inject

class MainActivity : BaseAppCompatActivity() {

    @Inject
    lateinit var tempClass: TempClass

    private val mainViewModel: MainViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            startActivity(Intent(this, Module1SetupActivity::class.java))
        }
        mainViewModel.init()
    }
}