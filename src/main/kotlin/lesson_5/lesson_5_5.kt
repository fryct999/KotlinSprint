package org.example.lesson_5

const val MIN_RANGE_NUM = 0
const val MAX_RANGE_NUM = 42
const val JACKPOTS_NUM = 3
const val BIG_PRIZE_NUM = 2
const val CONSOLATION_PRIZE_NUM = 1

fun main() {
    val range = MIN_RANGE_NUM .. MAX_RANGE_NUM
    val winNumsList: List<Int> = listOf(range.random(), range.random(), range.random())
    val userNumsList = mutableListOf<Int>()

    println("Enter the first number:")
    val firstNum = readLine()?.toInt() ?: 0

    println("Enter the second number:")
    val secondNum = readLine()?.toInt() ?: 0

    println("Enter the third number:")
    val thirdNum = readLine()?.toInt() ?: 0

    userNumsList.addAll(listOf(firstNum, secondNum, thirdNum))

    val correctAnswer = userNumsList.intersect(winNumsList).size
    val resultMsg = when(correctAnswer) {
        JACKPOTS_NUM -> "You guessed all the numbers and won the jackpot!"
        BIG_PRIZE_NUM -> "You guessed two numbers and gets a big prize!"
        CONSOLATION_PRIZE_NUM -> "You have guessed one number, and you will receive a consolation prize!"
        else -> "You haven't guessed a single number!"
    }

    println(resultMsg)
    println("Winning numbers: $winNumsList")
}