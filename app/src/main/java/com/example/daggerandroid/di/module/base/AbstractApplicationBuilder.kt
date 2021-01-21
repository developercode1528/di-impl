package com.example.daggerandroid.di.module.base

import com.core.base.di.modules.BaseAppModule
import com.example.daggerandroid.di.module.app.AppApplicationBuilder
import dagger.Module

/**
 * Created by Shivam Garg on 08/01/21.
 *
 */
@Module(
    includes = [
        BaseAppModule::class,
        AppApplicationBuilder::class
    ]
)
interface AbstractApplicationBuilder