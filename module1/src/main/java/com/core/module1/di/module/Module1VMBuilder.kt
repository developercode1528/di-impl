package com.core.module1.di.module

import androidx.lifecycle.ViewModel
import com.core.base.di.key.ViewModelKey
import com.core.module1.vm.Module1SetupActivityVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


/**
 * Created by Shivam Garg on 17/01/21.
 */
@Module
interface Module1VMBuilder {

    @IntoMap
    @Binds
    @ViewModelKey(Module1SetupActivityVM::class)
    fun bindModule1SetupActivityVM(module1SetupActivityVM: Module1SetupActivityVM): ViewModel
}