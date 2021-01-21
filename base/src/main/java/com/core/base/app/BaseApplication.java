package com.core.base.app;

import android.app.Application;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.core.base.di.component.BaseAppComponent;
import com.core.base.di.component.DaggerBaseAppComponent;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


/**
 * Created by Shivam Garg on 07/01/21.
 */
public abstract class BaseApplication extends DaggerApplication {

    @Inject
    public Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModelsMap;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        BaseAppComponent baseAppComponent = DaggerBaseAppComponent.builder()
                .setApplication(this)
                .setContext(getApplicationContext())
                .build();
        return applicationInjectorWithProjectModuleInit(this, baseAppComponent);
    }

    abstract protected AndroidInjector<? extends DaggerApplication> applicationInjectorWithProjectModuleInit(@NonNull Application application, @NonNull BaseAppComponent baseAppComponent);
}
