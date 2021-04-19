package com.example.dvtweather.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel() {

    private val _weather = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val weather: LiveData<String> = _weather
}