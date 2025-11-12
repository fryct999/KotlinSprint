package org.example.lesson_6

fun main() {
    // while, do while

    var counter = 5

    while (counter > 0) {
        println("ADS will end in ${counter--}")
        Thread.sleep(1000)
    }

    counter = 5

    do {
        println("ADS will end in ${counter--}")
        Thread.sleep(1000)
    } while(counter > 0)
}