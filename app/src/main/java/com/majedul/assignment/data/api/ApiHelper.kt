package com.majedul.assignment.data.api

import com.majedul.assignment.data.model.User

interface ApiHelper {

    suspend fun getUsers(): List<User>

}