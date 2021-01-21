package com.example.daggerandroid.di.module.app.impl

import com.core.base.di.scope.PerApplication
import com.example.daggerandroid.datasource.network.service.UserService
import com.example.daggerandroid.di.qualifiers.UserApiUrl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Shivam Garg on 08/01/21.
 */

@Module
object HttpServiceModule {

    @UserApiUrl
    @Provides
    fun provideUserApiUrl() = "https://jsonplaceholder.typicode.com/"

    @Provides
    @PerApplication
    fun provideUserService(@UserApiUrl userApiUrl: String, retrofitBuilder: Retrofit.Builder): UserService {
        return retrofitBuilder.baseUrl(userApiUrl).build().create(UserService::class.java)
    }
}