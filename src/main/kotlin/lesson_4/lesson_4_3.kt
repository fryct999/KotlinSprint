package org.example.lesson_4

const val REQUIRED_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "Winter"
const val REQUIREMENTS_FOR_TENT = true
const val REQUIREMENTS_FOR_SUNNY = true

fun main() {
    val weatherIsSunny = true
    val tentIsOpen = true
    val airHumidity = 20
    val season = "Winter"

    val printMsg = "Are the conditions for growing legumes favorable now? %b"

    println(printMsg.format(weatherIsSunny == REQUIREMENTS_FOR_SUNNY && tentIsOpen == REQUIREMENTS_FOR_TENT
            && airHumidity == REQUIRED_HUMIDITY && season != UNFAVORABLE_SEASON))
}