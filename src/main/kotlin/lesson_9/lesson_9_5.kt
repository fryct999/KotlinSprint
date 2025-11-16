package org.example.lesson_9

fun main() {
    var ingredientCount = 1
    val maxIngredient = 5

    val ingredientList: MutableList<String> = mutableListOf()

    while (ingredientCount <= maxIngredient) {
        println("Enter the name of $ingredientCount ingredient:")
        val ingredient = readln()

        if (ingredientList.any { it.equals(ingredient, ignoreCase = true)}) {
            println("Such an ingredient has already been added.")
            continue
        }

        ingredientList.add(ingredient)
        ingredientCount += 1
    }

    ingredientList.sort()
    ingredientList[0] = ingredientList[0].replaceFirstChar { it.uppercase() }
    println("You have added the following ingredients: ${ingredientList.joinToString(separator = ", ")}.")
}