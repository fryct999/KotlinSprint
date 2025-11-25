package org.example.lesson_16

class Dice {
    private val diceRange = 1..6
    private val value = diceRange.random()

    fun getDiceValue() {
        println(value)
    }
}