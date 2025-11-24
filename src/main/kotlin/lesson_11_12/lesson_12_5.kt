package org.example.lesson_11_12

import kotlin.random.Random

class DailyMeteo5(
    val nightTemperature: Int,
    val dayTemperature: Int,
    val hasRainfall: Boolean
)

fun main() {
    val dayList = mutableListOf<DailyMeteo5>()
    val temperatureRange = -10..30

    for (i in 1..30) {
        dayList.add(DailyMeteo5(temperatureRange.random(), temperatureRange.random(), Random.nextBoolean()))
    }

    val dayWithRainFall = dayList.filter { it.hasRainfall }
    val dayTemperatureList = "%.2f".format(dayList.map { it.dayTemperature }.average())
    val nightTemperatureList = "%.2f".format(dayList.map { it.nightTemperature }.average())

    println("Average daytime temperature: $dayTemperatureList. Average temperature at night: $nightTemperatureList. " +
                "Days with precipitation: ${dayWithRainFall.size}."
    )
}