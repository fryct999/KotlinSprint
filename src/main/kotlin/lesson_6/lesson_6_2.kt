package org.example.lesson_6

const val MLSEC_IN_SEC : Long = 1000

fun main() {
    println("Enter seconds:")
    val seconds = readLine()?.toIntOrNull() ?: 0

    var counter = seconds

    do {
        println("Left ${counter--} sec.")
        Thread.sleep(MLSEC_IN_SEC)
    } while (counter > 0)

    println("$seconds seconds have passed.")
}