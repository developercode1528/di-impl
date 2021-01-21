package com.core.module1.vm;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;

import com.core.base.vm.BaseViewModel;

import javax.inject.Inject;

/**
 * Created by Shivam Garg on 17/01/21.
 */
public class Module1SetupActivityVM extends BaseViewModel {

    @Inject
    public Module1SetupActivityVM(@NonNull Application application) {
        super(application);
    }

    public void init() {
        Log.d("TAG", "init() called from Module1SetupActivityVM and instance id is " + this);
    }
}
