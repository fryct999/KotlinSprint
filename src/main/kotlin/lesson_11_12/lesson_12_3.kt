package org.example.lesson_11_12

class DailyMeteo3(
    var nightTemperature: Int,
    var dayTemperature: Int,
    var haveRainfall: Boolean,
) {
    fun printData() {
        println(String.format("Today night temperature: $nightTemperature, day temperature: $dayTemperature, %s", if (haveRainfall)
            "there will be precipitation today" else "no precipitation today"))
    }
}

fun main() {

}