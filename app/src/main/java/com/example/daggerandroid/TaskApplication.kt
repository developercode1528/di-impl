package com.example.daggerandroid

import android.app.Application
import com.core.base.app.BaseApplication
import com.core.base.di.component.BaseAppComponent
import com.example.daggerandroid.di.component.ApplicationComponent
import com.example.daggerandroid.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 *
 * Created by Shivam Garg on 07/01/21.
 *
 *
 */
class TaskApplication : BaseApplication() {

    override fun applicationInjectorWithProjectModuleInit(
        application: Application,
        baseAppComponent: BaseAppComponent
    ): AndroidInjector<out DaggerApplication> {
        taskApplication = this
        taskApplicationComponent = DaggerApplicationComponent
            .builder()
            .baseAppComponent(baseAppComponent)
            .build()
        return taskApplicationComponent
    }

    companion object {
        lateinit var taskApplication: TaskApplication
        lateinit var taskApplicationComponent: ApplicationComponent
    }
}