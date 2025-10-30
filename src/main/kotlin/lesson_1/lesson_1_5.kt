package org.example.lesson_1

fun main() {
    val seconds = 6480
    val secondsLeft = formatString(seconds % 60)
    val minute = seconds / 60
    val minuteLeft = formatString(minute % 60)
    val hour = formatString(minute / 60)

    println("$hour:$minuteLeft:$secondsLeft")
}

fun formatString(value: Int): String {
    val valueStr = value.toString()
    return if (value <= 9) "0$valueStr" else valueStr
}