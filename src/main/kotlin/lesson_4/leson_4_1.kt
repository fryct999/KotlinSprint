package org.example.lesson_4

fun main() {
    val tableCount = 13
    val todayReserv = 13
    val tomorrowReserv = 9

    println("Availability of tables for today:${todayReserv != tableCount}")
    println("Availability of tables for tomorrow:${tomorrowReserv != tableCount}")
}