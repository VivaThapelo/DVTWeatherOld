package com.example.dvtweather

import android.location.Location

class Weather(val location: Location,val min: Int,val max: Int,val current: Int, val type: String, val forecast: Forecast) {

}