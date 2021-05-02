package com.weatherforecast.dvtweather

import android.location.Location
import com.example.dvtweather.Webservice
import org.junit.Assert
import org.junit.Test

class WeatherForecastUnitTest {

    val webservice : Webservice = TODO()

    @Test
    suspend fun getWeatherData(){
        val latitude: Double = 135.0
        val longitude: Double = 55.0
        Assert.assertNotNull(webservice.getWeather(longitude, latitude))
    }

    @Test
    suspend fun getForecastData(){
        val city: String = "Johannesburg"
        Assert.assertNotNull(webservice.getForecast(city))
    }
}