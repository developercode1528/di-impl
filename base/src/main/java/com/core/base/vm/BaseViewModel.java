package com.core.base.vm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;

/**
 * Created by Shivam Garg on 12/01/21.
 */
public class BaseViewModel extends AndroidViewModel implements SavedStateProvider {

    protected SavedStateHandle mSavedStateHandle;

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public final void installSavedState(SavedStateHandle savedStateHandle) {
        this.mSavedStateHandle = savedStateHandle;
    }
}
