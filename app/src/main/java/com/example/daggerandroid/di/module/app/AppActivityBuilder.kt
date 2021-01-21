package com.example.daggerandroid.di.module.app

import com.core.base.di.scope.PerActivity
import com.example.daggerandroid.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Shivam Garg on 15/01/21.
 */
@Module
interface AppActivityBuilder {

    /**
     * Provides the injector for the {@link MainActivity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity
}