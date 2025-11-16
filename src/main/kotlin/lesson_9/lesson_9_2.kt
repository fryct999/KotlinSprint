package org.example.lesson_9

fun main() {
    val positiveAnswer = "Yes"
    val negativeAnswer = "No"
    val ingredientList = mutableListOf("Egg", "Salt", "Pepper")

    println("The recipe has basic ingredients: $ingredientList")
    println("Would you like to add another ingredient? ($positiveAnswer / $negativeAnswer)")

    val userAnswer = readln()
    if (userAnswer.equals(positiveAnswer, ignoreCase = true)) {
        println("What ingredient do you want to add?")
        ingredientList.add(readln())

        println("Now the recipe has the following ingredients: $ingredientList")
    }
}