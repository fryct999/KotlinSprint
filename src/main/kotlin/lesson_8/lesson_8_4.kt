package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Egg", "Tomato", "Green", "Salt", "Pepper")
    println("The following ingredients are used in this recipe: ${arrayOfIngredients.joinToString(", ")}.")

    println("Enter the name of the ingredient you want to change:")
    val ingredientForReplacement = readln()
    val ingredientIndex = arrayOfIngredients.indexOf(ingredientForReplacement)

    if (ingredientIndex == -1) {
        println("$ingredientForReplacement not found.")
        return
    }

    println("Enter the ingredient you want to replace the $ingredientForReplacement with:")
    val changeIngredient = readln()

    arrayOfIngredients[ingredientIndex] = changeIngredient

    println("Ready! You have saved the following list: ${arrayOfIngredients.joinToString(", ")}.")
}