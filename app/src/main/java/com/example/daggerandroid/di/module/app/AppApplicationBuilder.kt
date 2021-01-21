package com.example.daggerandroid.di.module.app

import com.example.daggerandroid.di.module.app.impl.HttpServiceModule
import com.example.daggerandroid.di.module.app.impl.RepositoryModule
import dagger.Module


/**
 * Created by Shivam Garg on 18/01/21.
 */
@Module(
    includes = [
        HttpServiceModule::class,
        RepositoryModule::class
    ]
)
interface AppApplicationBuilder