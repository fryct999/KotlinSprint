package org.example.lesson_11_12

import kotlin.random.Random

class DailyMeteo5(
    var nightTemperature: Int,
    var dayTemperature: Int,
    var haveRainfall: Boolean
)

fun main() {
    val dayList = mutableListOf<DailyMeteo5>()
    val temperatureRange = -10 .. 30

    for (i in 1..30) {
        dayList.add(DailyMeteo5(temperatureRange.random(), temperatureRange.random(), Random.nextBoolean()))
    }

    var dayWithRainFall = 0
    val nightTemperatureList = mutableListOf<Int>()
    val dayTemperatureList = dayList.map {
        nightTemperatureList.add(it.dayTemperature)
        if (it.haveRainfall) dayWithRainFall += 1
        it.nightTemperature
    }

    println(String.format("Average daytime temperature: %.2f. Average temperature at night: %.2f. Days with precipitation: %d.",
        dayTemperatureList.average(), nightTemperatureList.average(), dayWithRainFall))
}