package com.core.login.app.vm

import android.app.Application
import android.util.Log
import com.core.base.vm.BaseViewModel
import javax.inject.Inject


/**
 * Created by Shivam Garg on 15/01/21.
 */
class LoginViewModel @Inject constructor(
    application: Application
) : BaseViewModel(application) {
    fun init() {
        Log.d("TAG", "init() called $this")
    }
}