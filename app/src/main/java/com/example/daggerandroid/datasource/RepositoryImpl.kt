package com.example.daggerandroid.datasource

import com.example.daggerandroid.datasource.network.modal.Users
import com.example.daggerandroid.datasource.network.service.UserService
import retrofit2.Response
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val userService: UserService) : Repository {

    override suspend fun getUsers(): Response<Users>  = userService.getUsers()

}