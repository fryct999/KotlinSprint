package org.example.lesson_7

fun main() {
    val numRange = 1000 .. 9999
    var authorization = false

    do {
        val code = numRange.random()
        println("Your authorization code: $code")

        println("Enter the verification code:")
        val userCode = readln().toInt()

        if (code == userCode) {
            authorization = true
            break
        }

        println("The code was entered incorrectly!")
    } while (authorization == false)

    println("Welcome!")
}