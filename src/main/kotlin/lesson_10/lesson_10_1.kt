package org.example.lesson_10

fun main() {
    val humanDiceNum = getDiceValue()
    val botDiceNum = getDiceValue()

    println("Human Dice Roll: $humanDiceNum")
    println("Bot Dice Roll: $botDiceNum")

    val msg = when {
        humanDiceNum > botDiceNum -> "Humanity has won!"
        humanDiceNum < botDiceNum -> "The computer won!"
        else -> "Friendship has won!"
    }

    println(msg)
}

fun getDiceValue() : Int = (1..6).random()