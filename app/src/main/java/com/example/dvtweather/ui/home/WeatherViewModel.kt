package com.example.dvtweather.ui.home

import android.location.Location
import androidx.lifecycle.*
import com.example.dvtweather.Forecast
import com.example.dvtweather.Weather
import com.example.dvtweather.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    weatherRepository: WeatherRepository,
) : ViewModel() {
    val location : String = savedStateHandle["location"] ?: throw IllegalArgumentException("missing location")
    val city : String = savedStateHandle["city"] ?: throw IllegalArgumentException("missing location")

    private val _weather = MutableLiveData<Weather>()
    val weather: MutableLiveData<Weather> = _weather

    private val _forecast = MutableLiveData<Forecast>()
    val forecast: MutableLiveData<Forecast> = _forecast

    init {
        viewModelScope.launch {
            _weather.value = weatherRepository.getWeather(location.split(",") as Double,location.split(',') as Double)
            _forecast.value = weatherRepository.getForecast(city)
        }
    }
}