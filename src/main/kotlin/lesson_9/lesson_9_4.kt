package org.example.lesson_9

import kotlin.collections.sorted

fun main() {
    println("Enter the 5 ingredients using the separator - \", \" ")
    val userIngredients = readln()

    val ingredientList = userIngredients.split(", ")
    val sortIngredientList = ingredientList.sorted()

    println("You have entered the following ingredients: $sortIngredientList")
}