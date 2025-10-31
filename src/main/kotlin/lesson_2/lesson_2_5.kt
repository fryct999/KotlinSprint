package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000

    val depositLifeTime = 20
    val yearPercent = 0.167
    val payPercentInYear = 1

    val totalSum = deposit * (1 + yearPercent / payPercentInYear).pow(payPercentInYear * depositLifeTime)

    println(String.format("%.3f", totalSum))
}