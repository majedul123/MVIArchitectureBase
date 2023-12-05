package com.majedul.assignment.data.api

import com.majedul.assignment.data.model.User
import retrofit2.http.GET

interface ApiService {

   @GET("users")
   suspend fun getUsers(): List<User>
}