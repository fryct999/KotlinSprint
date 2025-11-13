package org.example.lesson_6

const val MIN_INT_DIAPASON = 0
const val MAX_INT_DIAPASON = 9

fun main() {
    val range = MIN_INT_DIAPASON .. MAX_INT_DIAPASON
    var tryCount = 3
    var solved = false

    while (tryCount > 0 && solved == false) {
        val firstNum = range.random()
        val secNum = range.random()
        val sum = firstNum + secNum

        println("To access the site, solve the example $firstNum+$secNum=?")
        val enterNum = readln()?.toIntOrNull() ?: -1

        solved = enterNum == sum
        tryCount--
    }

    val msg = when(solved) {
        true -> "Access accept!"
        else -> "Access is denied!"
    }

    println(msg)
}