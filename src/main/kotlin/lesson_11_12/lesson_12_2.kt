package org.example.lesson_11_12

class DailyMeteo2() {
    var nightTemperature = 0
    var dayTemperature = 0
    var haveRainfall = false

    fun printData() {
        println(String.format("Today night temperature: $nightTemperature, day temperature: $dayTemperature, %s", if (haveRainfall)
            "there will be precipitation today" else "no precipitation today"))
    }
}

fun main() {

}