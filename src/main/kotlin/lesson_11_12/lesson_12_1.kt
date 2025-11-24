package org.example.lesson_11_12

class DailyMeteo {
    var nightTemperature = 0
    var dayTemperature = 0
    var hasRainfall = false

    fun printData() {
        val rainfallString = if (hasRainfall) "there will be precipitation today"
        else "no precipitation today"

        println("Today night temperature: $nightTemperature, day temperature: $dayTemperature, $rainfallString.")
    }
}

fun main() {
    val day1 = DailyMeteo()
    day1.nightTemperature = -10
    day1.dayTemperature = 11
    day1.hasRainfall = true

    val day2 = DailyMeteo()
    day2.nightTemperature = -8
    day2.dayTemperature = 7

    day1.printData()
    day2.printData()
}