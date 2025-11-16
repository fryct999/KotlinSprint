package org.example.lesson_7

const val DELAY_TIME = 1000L
const val MIN_LOOP_RANGE = 1

fun main() {
    println("Enter the number of seconds:")
    val seconds = readln().toInt()
    val loopRange = seconds downTo MIN_LOOP_RANGE

    for (i in loopRange) {
        println("$i seconds left.")
        Thread.sleep(DELAY_TIME)
    }

    println("Time is over.")
}