package com.example.composedemo.repository.service

import com.example.composedemo.App
import com.example.composedemo.repository.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET

interface PlaceService {

    @GET("v2/place?token=${App.TOKEN}&lang=zh_CN")
    fun searchPlaces(query: String): Call<PlaceResponse>
}