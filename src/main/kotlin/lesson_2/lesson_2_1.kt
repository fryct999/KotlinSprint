package org.example.lesson_2

fun main() {
    val grades = arrayOf(3, 4, 3, 5)
    val average = grades.sum().toFloat() / grades.size

    println("%.2f".format(average))
}