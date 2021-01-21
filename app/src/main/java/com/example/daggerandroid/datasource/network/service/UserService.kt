package com.example.daggerandroid.datasource.network.service

import com.example.daggerandroid.datasource.network.modal.Users
import retrofit2.Response
import retrofit2.http.GET


/**
 * Created by Shivam Garg on 08/01/21.
 */
interface UserService {

    @GET("users/")
    suspend fun getUsers(): Response<Users>

}