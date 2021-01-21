package com.example.daggerandroid.datasource

import com.example.daggerandroid.datasource.network.modal.Users
import com.google.gson.Gson
import retrofit2.Response
import javax.inject.Inject

class FakeRepository @Inject constructor() : Repository {

    override suspend fun getUsers(): Response<Users> {
        val response = "[]"
        return Response.success(Gson().fromJson(response, Users::class.java))
    }
}