package org.example.lesson_11_12

const val KELVIN_COEFFICIENT = 273

class DailyMeteo3(
    _nightTemperature: Int,
    _dayTemperature: Int,
    _hasRainfall: Boolean,
) {
    var nightTemperature: Int = _nightTemperature - KELVIN_COEFFICIENT
    var dayTemperature: Int = _dayTemperature - KELVIN_COEFFICIENT
    var hasRainfall = _hasRainfall

    fun printData() {
        println("Today night temperature: $nightTemperature, day temperature: $dayTemperature, " +
                if (hasRainfall) "there will be precipitation today" else "no precipitation today"
        )
    }
}

fun main() {
    val day1 = DailyMeteo3(_nightTemperature = 230, _dayTemperature = 260, _hasRainfall = false)
    day1.printData()
}