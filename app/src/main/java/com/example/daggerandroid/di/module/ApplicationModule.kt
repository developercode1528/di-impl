package com.example.daggerandroid.di.module

import com.example.daggerandroid.di.module.base.AbstractActivityBuilder
import com.example.daggerandroid.di.module.base.AbstractApplicationBuilder
import com.example.daggerandroid.di.module.base.AbstractViewModelBuilder
import dagger.Module

/**
 * Created by Shivam Garg on 16/01/21.
 */

/**
 * Provides application-wide dependencies.
 */
@Module(
    includes =
    [
        AbstractApplicationBuilder::class,
        AbstractViewModelBuilder::class,
        AbstractActivityBuilder::class
    ]
)
interface ApplicationModule