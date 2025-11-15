package org.example.lesson_6

const val MLSEC_IN_SEC : Long = 1000

fun main() {
    println("Enter seconds:")
    val seconds = readln().toInt()

    Thread.sleep(MLSEC_IN_SEC * seconds)
    println("$seconds seconds have passed.")
}