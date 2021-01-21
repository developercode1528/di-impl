package com.example.daggerandroid.di.module.base

import com.core.login.di.modules.LoginActivityBuilder
import com.core.module1.di.module.Module1ActivityBuilder
import com.example.daggerandroid.di.module.app.AppActivityBuilder
import dagger.Module

/**
 * Created by Shivam Garg on 08/01/21.
 *
 */
@Module(
    includes = [
        AppActivityBuilder::class,
        LoginActivityBuilder::class,
        Module1ActivityBuilder::class
    ]
)
interface AbstractActivityBuilder