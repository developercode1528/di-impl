package com.core.login.di.modules

import com.core.base.di.scope.PerActivity
import com.core.login.app.activity.LoginActivity
import com.core.login.di.modules.activity.LoginActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Shivam Garg on 08/01/21.
 */

@Module
interface LoginActivityBuilder {

    /**
     * Provides the injector for the {@link LoginActivity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    fun contributeLoginActivity(): LoginActivity
}