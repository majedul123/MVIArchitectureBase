package com.majedul.assignment.data.repository

import com.majedul.assignment.data.api.ApiHelper


class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}