package org.example.lesson_7

fun main() {
    println("Enter number:")
    val userNum = readln().toInt()

    val lastRangeNum = if(userNum % 2 == 0) userNum else userNum - 1

    if (userNum <= 0) {
        println("Incorrect data.")
        return
    }

    val numRange = 0 .. lastRangeNum step 2

    val msg = "All even numbers in the range: ${numRange.joinToString()}"
    println(msg)
}