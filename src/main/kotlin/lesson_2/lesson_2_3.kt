package org.example.lesson_2

const val MINUTES_PER_HOUR = 60
const val HOUR_PER_DAY = 24

fun main() {
    val wayTime = 457
    val startHour = 9
    val startMinute = 39

    println(calculatingArrivalTime(startHour, startMinute, wayTime))
}

fun calculatingArrivalTime(startHour: Int, startMinute: Int, wayTime: Int): String {
    val minutesNum = startMinute + wayTime
    val minutesWayLeft = minutesNum % MINUTES_PER_HOUR
    val hoursWay = minutesNum / MINUTES_PER_HOUR

    var arrivalHour = startHour + hoursWay
    arrivalHour = if (arrivalHour >= HOUR_PER_DAY) arrivalHour - HOUR_PER_DAY else arrivalHour

    return "%02d:%02d".format(arrivalHour, minutesWayLeft)
}