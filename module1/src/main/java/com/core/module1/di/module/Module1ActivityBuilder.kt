package com.core.module1.di.module

import com.core.base.di.scope.PerActivity
import com.core.module1.ui.Module1SetupActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by Shivam Garg on 17/01/21.
 */
@Module
interface Module1ActivityBuilder {

    @ContributesAndroidInjector
    @PerActivity
    fun bindModule1SetupActivity(): Module1SetupActivity
}