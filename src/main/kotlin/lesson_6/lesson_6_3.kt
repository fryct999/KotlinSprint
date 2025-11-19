package org.example.lesson_6

//const val MLSEC_IN_SEC : Long = 1000

fun main() {
    println("Enter seconds:")
    val seconds = readln().toInt()

    var counter = seconds

    while (counter > 0) {
        println("Left second: ${counter--}")
        Thread.sleep(MLSEC_IN_SEC)
    }

    println("Out of time.")
}