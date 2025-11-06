package org.example.lesson_5

import kotlin.math.pow

const val CM_IN_M = 100
const val HEIGHT_EXPONENT = 2
const val INSUFFICIENT_WEIGHT = 18.5
const val NORMAL_WEIGHT = 25.0
const val EXCESS_WEIGHT = 30.0

fun main() {
    println("Enter your weight in kg:")
    val weight = readLine()?.toDouble() ?: 0.0

    println("Enter your height in cm:")
    var height = readLine()?.toDouble() ?: 0.0

    if (weight <= 0.0 || height <= 0.0) {
        println("Incorrect data has been entered!")
        return
    }

    height /= CM_IN_M
    val imt = weight / height.pow(HEIGHT_EXPONENT)
    val imtTypeStr = when {
        imt < INSUFFICIENT_WEIGHT -> "insufficient body weight"
        imt in INSUFFICIENT_WEIGHT..< NORMAL_WEIGHT -> "normal body weight"
        imt in NORMAL_WEIGHT..< EXCESS_WEIGHT -> "excess body weight"
        else -> "fatness"
    }

    println("Your IMT - ${"%.2f".format(imt)}. This corresponds to - $imtTypeStr")
}