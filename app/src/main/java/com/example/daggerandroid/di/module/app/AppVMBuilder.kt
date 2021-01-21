package com.example.daggerandroid.di.module.app

import androidx.lifecycle.ViewModel
import com.core.base.di.key.ViewModelKey
import com.example.daggerandroid.vm.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


/**
 * Created by Shivam Garg on 15/01/21.
 */
@Module
interface AppVMBuilder {

    @IntoMap
    @Binds
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel
}