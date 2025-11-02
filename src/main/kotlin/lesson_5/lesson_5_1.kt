package org.example.lesson_5

const val MIN_RANGE_NUM = 1
const val MAX_RANGE_NUM = 100

fun main() {
    val range = MIN_RANGE_NUM..MAX_RANGE_NUM
    val firstNum = range.random()
    val secondNum = range.random()
    val sumNum = firstNum + secondNum

    println("Enter the example solution: $firstNum + $secondNum = ?")

    val userAnswer: Int? = readlnOrNull()?.toIntOrNull()

    if (userAnswer == sumNum) println("Access accept!")
    else println("Access denied!")
}