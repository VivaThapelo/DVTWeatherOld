package com.example.dvtweather

import retrofit2.http.GET
import retrofit2.http.Path

const val appID: String = "" // Add API KEY

interface Webservice {

    @GET("/data/2.5/weather?lat={latitude}&lon={longitude}&appid=$appID")
    suspend fun getWeather(@Path("weather") latitude: Long, longitude:Long): Weather

    @GET("/data/2.5/forecast?q={city}&appid=$appID")
    suspend fun getForecast(@Path("forecast") city: String): Forecast
}