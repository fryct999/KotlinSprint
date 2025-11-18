package org.example.lesson_9

fun main() {
    var ingredientCount = 1
    val maxIngredient = 5
    val ingredients = mutableSetOf<String>()

    while (ingredientCount <= maxIngredient) {
        println("Enter the name of $ingredientCount ingredient:")
        val ingredient = readln().lowercase()

        if (ingredients.add(ingredient)) ingredientCount += 1
        else println("Such an ingredient has already been added.")
    }

    val ingredientList = ingredients.sorted().toMutableList()
    ingredientList[0] = ingredientList[0].replaceFirstChar { it.uppercase() }
    println("You have added the following ingredients: ${ingredientList.joinToString(separator = ", ")}.")
}