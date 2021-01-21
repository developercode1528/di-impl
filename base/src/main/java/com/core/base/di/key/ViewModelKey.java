package com.core.base.di.key;

import androidx.lifecycle.ViewModel;

import dagger.MapKey;

/**
 * Created by Shivam Garg on 12/01/21.
 */
@MapKey
public @interface ViewModelKey {
    Class<? extends ViewModel> value();
}
