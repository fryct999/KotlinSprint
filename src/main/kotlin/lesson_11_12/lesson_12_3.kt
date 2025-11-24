package org.example.lesson_11_12

const val KELVIN_COEFFICIENT = 273

class DailyMeteo3(
    _nightTemperature: Int,
    _dayTemperature: Int,
    _hasRainfall: Boolean,
) {
    val nightTemperature: Int = _nightTemperature - KELVIN_COEFFICIENT
    val dayTemperature: Int = _dayTemperature - KELVIN_COEFFICIENT
    val hasRainfall = _hasRainfall

    fun printData() {
        val rainfallString = if (hasRainfall) "there will be precipitation today"
        else "no precipitation today"

        println("Today night temperature: $nightTemperature, day temperature: $dayTemperature, $rainfallString.")
    }
}

fun main() {
    val day1 = DailyMeteo3(_nightTemperature = 230, _dayTemperature = 260, _hasRainfall = false)
    day1.printData()
}