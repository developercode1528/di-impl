package com.example.daggerandroid.di.module.base

import com.core.login.di.modules.LoginVMBuilder
import com.core.module1.di.module.Module1VMBuilder
import com.example.daggerandroid.di.module.app.AppVMBuilder
import dagger.Module


/**
 * Created by Shivam Garg on 15/01/21.
 */
@Module(
    includes = [
        LoginVMBuilder::class,
        AppVMBuilder::class,
        Module1VMBuilder::class
    ]
)
interface AbstractViewModelBuilder