package com.core.base.di.modules;

import dagger.Module;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Shivam Garg on 15/01/21.
 */
@Module(includes =
        {
                AndroidInjectionModule.class,
                AndroidViewModelInjectionModule.class
        }
)
public interface BaseAppModule {
}
