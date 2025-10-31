package org.example.lesson_2

const val MINUTES_PER_HOUR = 60
const val HOUR_PER_DAY = 24

fun main() {
    val wayTime = 457
    val startHour = 9
    val startMinute = 39

    println(calculatingArrivalTime(startHour, startMinute, wayTime))
}

fun calculatingArrivalTime(startHour: Int, startMinute: Int, wayTime: Int ) : String {
    var hoursWay = wayTime / MINUTES_PER_HOUR
    val minutesWayLeft = wayTime % MINUTES_PER_HOUR

    var arrivalMinute = startMinute + minutesWayLeft

    if (arrivalMinute >= 60) {
        arrivalMinute -= 60
        hoursWay += 1
    }

    var arrivalHour = startHour + hoursWay
    arrivalHour = if (arrivalHour >= HOUR_PER_DAY) arrivalHour - HOUR_PER_DAY else arrivalHour

    return String.format("%02d", arrivalHour) + ":" + String.format("%02d", arrivalMinute)
}