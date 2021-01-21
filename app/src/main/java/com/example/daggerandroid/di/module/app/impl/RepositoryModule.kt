package com.example.daggerandroid.di.module.app.impl

import com.core.base.di.scope.PerApplication
import com.example.daggerandroid.datasource.Repository
import com.example.daggerandroid.datasource.RepositoryImpl
import dagger.Binds
import dagger.Module

/**
 * Created by Shivam Garg on 08/01/21.
 */

@Module
abstract class RepositoryModule {

    @Binds
    @PerApplication
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository
}