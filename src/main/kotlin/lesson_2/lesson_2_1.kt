package org.example.lesson_2

fun main() {
    val grades = arrayOf(3, 4, 3, 5)
    val average = grades.sum().toFloat() / grades.size.toFloat()
    val averagePrint = String.format("%.2f", average)

    println(averagePrint)
}