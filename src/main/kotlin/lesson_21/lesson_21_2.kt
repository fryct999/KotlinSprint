package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0

    this.forEach {
        if (it % 2 == 0) sum += it
    }

    return sum
}

fun main() {
    val list = listOf(52, 23, 11, 12, 1, 6, 0, 33)
    println(list.evenNumbersSum())
}