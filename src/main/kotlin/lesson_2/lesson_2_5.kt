package org.example.lesson_2

import kotlin.math.pow

//const val MAX_PERCENT = 100

fun main() {
    val deposit = 70000
    val depositLifeTime = 20
    val yearPercent = 16.7
    val yearPercentDec = yearPercent / MAX_PERCENT

    val totalSum = deposit * (1 + yearPercentDec ).pow(depositLifeTime)

    println("%.3f".format(totalSum))
}