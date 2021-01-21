package com.core.base.vm;

import androidx.lifecycle.SavedStateHandle;

/**
 * Created by Shivam Garg on 12/01/21.
 */
interface SavedStateProvider {
    void installSavedState(SavedStateHandle savedStateHandle);
}
