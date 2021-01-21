package com.core.base.service;

import dagger.android.DaggerIntentService;

/**
 * Created by Shivam Garg on 08/01/21.
 *
 */
public abstract class BaseIntentService extends DaggerIntentService {

    public BaseIntentService(String name) {
        super(name);
    }
}
