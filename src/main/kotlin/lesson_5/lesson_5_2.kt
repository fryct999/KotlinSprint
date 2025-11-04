package org.example.lesson_5

const val AGE_MAJORITY = 18

fun main() {
    println("Enter the year of birth:")
    val birthYear: Int? = readLine()?.toIntOrNull()

    if (birthYear == null || birthYear < 0) {
        println("Incorrect data has been entered!")
        return
    }

    val userAge = java.time.Year.now().value - birthYear

    val resultText = if(userAge >= AGE_MAJORITY) "Show a screen with hidden content."
    else "Back to the main screen"

    println(resultText)
}