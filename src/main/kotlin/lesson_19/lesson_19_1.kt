package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGEL_FISH,
    GOLD_FISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("You can add the following fish to the aquarium: ${Fish.entries.joinToString()}")
}