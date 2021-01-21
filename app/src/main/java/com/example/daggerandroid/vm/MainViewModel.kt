package com.example.daggerandroid.vm

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.core.base.vm.BaseViewModel
import com.example.daggerandroid.datasource.Repository
import javax.inject.Inject


/**
 * Created by Shivam Garg on 08/01/21.
 */
class MainViewModel @Inject constructor(
    application: Application,
    private val repository: Repository
) : BaseViewModel(application) {

    fun init() {
        if (mSavedStateHandle.contains("processDeath")) {
            Log.d("TAG", "init() called and value already there ${mSavedStateHandle.keys()}")
        } else {
            mSavedStateHandle.set("processDeath", "valueSaved")
            Log.d("TAG", "init() called and value inserted")
        }
    }
}