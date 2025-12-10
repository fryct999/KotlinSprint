package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    val evenNums = filter { it % 2 == 0 }
    val sum = evenNums.sum()

    return sum
}

fun main() {
    val list = listOf(52, 23, 12, 11, 1, 6, 0, 33)
    println(list.evenNumbersSum())
}