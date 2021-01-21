package com.core.login.di.modules.activity

import com.core.base.di.scope.PerFragment
import com.core.login.app.fragment.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Shivam Garg on 17/01/21.
 */
@Module
interface LoginActivityModule {

    @PerFragment
    @ContributesAndroidInjector
    fun contributeLoginFragment(): LoginFragment
}