package com.example.composedemo.repository

import androidx.lifecycle.liveData
import com.example.composedemo.repository.service.ServiceNetwork
import kotlinx.coroutines.Dispatchers

object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = ServiceNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            }else {
                Result.failure(
                    RuntimeException("response status is ${placeResponse.status}")
                )
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
        emit(result)
    }
}