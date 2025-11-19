package org.example.lesson_11_12

const val KELVIN_COEFFICIENT = 273.15

class DailyMeteo3() {
    var nightTemperature: Int = 0
    var dayTemperature: Int = 0
    var haveRainfall = false

    fun printData() {
        println(String.format("Today night temperature: ${nightTemperature - KELVIN_COEFFICIENT}, day temperature: ${dayTemperature - KELVIN_COEFFICIENT}, %s",
                if (haveRainfall) "there will be precipitation today." else "no precipitation today."))
    }

    init {
        printData()
    }
}

fun main() {
    val day1 = DailyMeteo3()
    day1.nightTemperature = 230
    day1.dayTemperature = 260
}