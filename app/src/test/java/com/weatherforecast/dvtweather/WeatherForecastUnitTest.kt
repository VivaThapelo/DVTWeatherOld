package com.weatherforecast.dvtweather

import android.location.Location
import org.junit.Assert
import org.junit.Test

class WeatherForecastUnitTest {
    @Test
    fun getWeatherData(location: Location){
        Assert.assertNotNull(webservice.getWeather(location))
    }

    @Test
    fun getForecastData(location: Location){
        Assert.assertNotNull(webservice.getForecast(location))
    }
}