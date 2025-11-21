package org.example.lesson_11_12

class DailyMeteo2(
    val nightTemperature: Int,
    val dayTemperature: Int,
    val hasRainfall: Boolean,
) {
    fun printData() {
        println("Today night temperature: $nightTemperature, day temperature: $dayTemperature, ${if (hasRainfall)
            "there will be precipitation today" else "no precipitation today"}")
    }
}

fun main() {
    val day1 = DailyMeteo2(nightTemperature = -10, dayTemperature = -5, hasRainfall = false)
    day1.printData()
}