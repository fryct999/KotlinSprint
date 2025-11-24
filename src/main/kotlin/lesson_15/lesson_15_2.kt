package org.example.lesson_15

abstract class WeatherStationStats() {}

class Temperature() : WeatherStationStats() {}
class PrecipitationAmount() : WeatherStationStats() {}

class WeatherServer() {
    fun sendMsg(stat: WeatherStationStats) {
        if (stat is Temperature) println("The temperature data.")
        else println("Precipitation data.")
    }
}

fun main() {
    val server = WeatherServer()
    val temperature = Temperature()
    val precipitation = PrecipitationAmount()

    server.sendMsg(temperature)
    server.sendMsg(precipitation)
}