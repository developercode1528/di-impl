package com.example.daggerandroid.di.component

import com.core.base.di.component.BaseAppComponent
import com.core.base.di.scope.PerApplication
import com.example.daggerandroid.TaskApplication
import com.example.daggerandroid.di.module.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjector

/**
 * Created by Shivam Garg on 07/01/21.
 *
 */
@PerApplication
@Component(
    dependencies =
    [
        BaseAppComponent::class
    ],
    modules =
    [
        ApplicationModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<TaskApplication>