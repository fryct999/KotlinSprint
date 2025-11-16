package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Egg", "Tomato", "Green", "Salt", "Pepper")

    println("Enter the name of the ingredient:")
    val userIngredient = readln()

    if (userIngredient in arrayOfIngredients) println("The ingredient $userIngredient is in the recipe.")
    else println("There's no such ingredient in the recipe.")
}