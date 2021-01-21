package com.core.base.vm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by Shivam Garg on 12/01/21.
 */
public class ViewModelFactory extends AbstractSavedStateViewModelFactory {

    private final Map<Class<? extends ViewModel>, Provider<ViewModel>> mViewModelProviders;

    public ViewModelFactory(Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModelProviders, @NonNull SavedStateRegistryOwner owner, @Nullable Bundle bundle) {
        super(owner, bundle);
        this.mViewModelProviders = viewModelProviders;
    }

    @NonNull
    @Override
    protected <T extends ViewModel> T create(@NonNull String key, @NonNull Class<T> modelClass, @NonNull SavedStateHandle handle) {
        Provider<ViewModel> provider = mViewModelProviders.get(modelClass);
        if (provider != null) {
            T t = (T) provider.get();
            if (t instanceof SavedStateProvider) {
                ((SavedStateProvider) t).installSavedState(handle);
            }
            return t;
        }
        String viewModelModuleName = "ViewModelsModule";
        String viewModelName = modelClass.getSimpleName();
        throw new IllegalStateException(String.format("Method declaration missing inside %s \n\n Kindly add given method with below details\n\n" +
                "@Binds\n" +
                "@IntoMap\n" +
                "@ViewModelKey(%s.class)\n" +
                "abstract %s bind%s(%s %s);", viewModelModuleName, viewModelName, ViewModel.class.getSimpleName(), viewModelName, viewModelName, viewModelName.toLowerCase()));
    }
}