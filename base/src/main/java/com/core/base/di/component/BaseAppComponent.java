package com.core.base.di.component;

import android.app.Application;
import android.content.Context;

import com.core.base.di.modules.NetworkModule;
import com.core.base.di.scope.PerApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by Shivam Garg on 07/01/21.
 */

@Component(modules = {NetworkModule.class})
@Singleton
public interface BaseAppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder setApplication(Application application);

        @BindsInstance
        Builder setContext(Context context);

        BaseAppComponent build();
    }

    /**
     * this coming from base app component
     *
     * @return application instance
     */
    Application getApplication();

    /**
     * this coming from base app component
     *
     * @return application context
     */
    Context getContext();

    /**
     * this coming via network module
     *
     * @return okhttp client instance
     */
    OkHttpClient getOkHttpClient();

    /**
     * this coming via network module
     *
     * @return retrofit instance
     */
    Retrofit getRetrofit();

    /**
     * this coming via network module
     *
     * @return retrofit builder instance
     */
    Retrofit.Builder getRetrofitBuilder();
}