package org.example.lesson_3

fun main() {
    val historyString = "D2-D4;0"

    val splitString = historyString.split("[-;]".toRegex())
    val from = splitString[0]
    val where = splitString[1]
    val numStep = splitString[2]

    println(from)
    println(where)
    println(numStep)
}