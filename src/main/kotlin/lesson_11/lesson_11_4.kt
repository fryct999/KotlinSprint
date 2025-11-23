package org.example.lesson_11

class Category(
    val image: String,
    val name: String,
    val descriptor: String,
    val recipeList: MutableList<Recipe>,
    var inFavorite: Boolean = false,
)

class Recipe(
    val image: String,
    val name: String,
    val ingredient: Map<Ingredient, Int>,
    val instruction: String,
    var inFavorite: Boolean = false,
)

class Ingredient(
    val name: String,
)