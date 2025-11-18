package org.example.lesson_10

fun main() {
    var winsCounter = 0
    var gameStart = true
    val positiveAnswer = "Yes"
    val negativeAnswer = "No"

    while (gameStart) {
        val gameResult = playGameRound()
        if (gameResult == true) winsCounter += 1

        println("Would you like to play it again? ($positiveAnswer / $negativeAnswer).")
        if (readln().equals(negativeAnswer, ignoreCase = true)) gameStart = false
    }

    println("You have won $winsCounter games.")
}

fun playGameRound() : Boolean {
    val humanDiceNum = getDiceValue()
    val botDiceNum = getDiceValue()

    println("Human Dice Roll: $humanDiceNum")
    println("Bot Dice Roll: $botDiceNum")

    when {
        humanDiceNum > botDiceNum -> {
            println("Humanity has won!")
            return true
        }
        humanDiceNum < botDiceNum -> {
            println("The computer won!")
            return false
        }
        else -> {
            println("Friendship has won!")
            return false
        }
    }
}

fun getDiceValue() : Int = (1..6).random()