package org.example.lesson_11.tutorial

class Dish(
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {
    fun addToFavorites() {
        println("Dish: $name add to favorite.")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Dish: $name remove from favorite.")
        inFavorites = false
    }

    fun startCooking() {
        println("User move to cooking screen $name dish.")
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }
}