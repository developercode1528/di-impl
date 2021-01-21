package com.core.base.di.modules;

import androidx.lifecycle.ViewModel;

import java.util.Map;
import dagger.Module;
import dagger.multibindings.Multibinds;

/**
 * Created by Shivam Garg on 15/01/21.
 */
@Module
abstract class AndroidViewModelInjectionModule {

    private AndroidViewModelInjectionModule() {
    }

    @Multibinds
    abstract Map<Class<? extends ViewModel>, ViewModel> viewModelsMap();
}
