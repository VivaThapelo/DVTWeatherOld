package com.example.dvtweather

import javax.inject.Inject

class WeatherRepository @Inject constructor(private val webservice: Webservice) {
    suspend fun getWeather(latitude: Double,longitude: Double) = webservice.getWeather(latitude,longitude)
    suspend fun getForecast(city:String) = webservice.getForecast(city)
}