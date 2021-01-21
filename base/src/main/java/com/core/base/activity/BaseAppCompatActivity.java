package com.core.base.activity;

import android.app.Application;

import androidx.lifecycle.ViewModel;

import com.core.base.app.BaseApplication;
import com.core.base.vm.ViewModelFactory;

import java.util.Map;

import javax.inject.Provider;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by Shivam Garg on 08/01/21.
 */
public abstract class BaseAppCompatActivity extends DaggerAppCompatActivity {

    private ViewModelFactory mViewModelFactory;

    public ViewModelFactory getViewModelFactory() {
        if (mViewModelFactory == null) {
            Application application = getApplication();
            if (!(application instanceof BaseApplication)) {
                throw new IllegalStateException("Extend your application class with " + BaseApplication.class.getSimpleName());
            }
            Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModelsMap = ((BaseApplication) application).viewModelsMap;
            mViewModelFactory = new ViewModelFactory(viewModelsMap, this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return mViewModelFactory;
    }

    @Override
    protected void onDestroy() {
        mViewModelFactory = null;
        super.onDestroy();
    }
}
