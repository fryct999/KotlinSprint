package org.example.lesson_4

fun main() {
    // логические операторы
    // операторы сравнения

    val a = 1 + 1
    val b = (1==1)

    // <, >, >=, <=, ==, !=, ===, !===
    // true false
    // &&, ||, !

    val userAge = 50
    //val comparisonResult: Boolean = (userAge >= AGE_OF_MAJORITY) and (userAge <= RETIREMENT_AGE)
    val comparisonResult: Boolean = userAge >= AGE_OF_MAJORITY && !(userAge >= RETIREMENT_AGE)
    val result = userAge !in AGE_OF_MAJORITY .. RETIREMENT_AGE
    println("Result is: $comparisonResult")

//    println(0 < -1)
//    println(1 == 1)
//    println(2 == 3)
//    println(7 != 8)

    val c = true
    val d = !c
    println(d)
}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65