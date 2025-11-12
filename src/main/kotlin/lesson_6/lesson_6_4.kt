package org.example.lesson_6

const val MIN_RAND_RANGE = 0
const val MAX_RAND_RANGE = 9

fun main() {
    val range = MIN_RAND_RANGE .. MAX_RAND_RANGE
    val num = range.random()
    var tryCount = 5

    while (tryCount > 0) {
        println("Enter num:")
        val enteredNum = readln()?.toIntOrNull() ?: 0

        if(enteredNum == num) {
            println("It was a great game!")
            return
        } else {
            println("Wrong! There are ${--tryCount} attempts left.")
        }
    }

    println("The number $num was guessed")
}