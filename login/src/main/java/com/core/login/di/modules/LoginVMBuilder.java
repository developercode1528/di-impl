package com.core.login.di.modules;

import androidx.lifecycle.ViewModel;

import com.core.base.di.key.ViewModelKey;
import com.core.login.app.vm.LoginViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Shivam Garg on 12/01/21.
 */
@Module
public interface LoginVMBuilder {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    ViewModel bindLoginVM(LoginViewModel loginVM);
}
