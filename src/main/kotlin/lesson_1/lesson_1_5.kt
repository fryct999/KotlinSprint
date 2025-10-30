package org.example.lesson_1

const val NUM_SECONDS = 60
const val NUM_MINUTES = 60

fun main() {
    val seconds = 6480
    val minute = seconds / NUM_SECONDS
    val hour = minute / NUM_MINUTES

    val secondsPrint = String.format("%02d", seconds % NUM_SECONDS)
    val minutePrint = String.format("%02d", minute % NUM_MINUTES)
    val hourPrint = String.format("%02d", hour)

    println("$hourPrint:$minutePrint:$secondsPrint")
}