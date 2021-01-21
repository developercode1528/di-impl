package com.core.base.fragment;

import android.app.Application;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;

import com.core.base.activity.BaseAppCompatActivity;
import com.core.base.app.BaseApplication;
import com.core.base.vm.ViewModelFactory;

import java.util.Map;

import javax.inject.Provider;

import dagger.android.support.DaggerDialogFragment;

/**
 * Created by Shivam Garg on 08/01/21.
 */
public abstract class BaseDialogFragment extends DaggerDialogFragment {

    private ViewModelFactory mViewModelFactory;
    private ViewModelFactory mActivityViewModelFactory;

    protected ViewModelFactory getViewModelFactory() {
        if (mViewModelFactory == null) {
            Application application = getActivity().getApplication();
            if (!(application instanceof BaseApplication)) {
                throw new IllegalStateException("Extend your application class with " + BaseApplication.class.getSimpleName());
            }
            Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModelsMap = ((BaseApplication) application).viewModelsMap;
            mViewModelFactory = new ViewModelFactory(viewModelsMap, this, null);
        }
        return mViewModelFactory;
    }

    protected ViewModelFactory getActivityViewModelFactory() {
        if (mActivityViewModelFactory == null) {
            FragmentActivity activity = requireActivity();
            if (!(activity instanceof BaseAppCompatActivity)) {
                throw new IllegalStateException("Extend your activity class with " + BaseAppCompatActivity.class.getSimpleName());
            }
            BaseAppCompatActivity baseAppCompatActivity = (BaseAppCompatActivity) activity;
            mActivityViewModelFactory = baseAppCompatActivity.getViewModelFactory();
        }
        return mActivityViewModelFactory;
    }

    @Override
    public void onDetach() {
        mViewModelFactory = null;
        mActivityViewModelFactory = null;
        super.onDetach();
    }
}
