package com.majedul.assignment.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.majedul.assignment.data.api.ApiHelper
import com.majedul.assignment.data.repository.MainRepository
import com.majedul.assignment.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}