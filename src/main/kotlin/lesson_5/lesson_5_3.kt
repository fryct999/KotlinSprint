package org.example.lesson_5

fun main() {
    val firstWinNum = 24
    val secondWinNum = 37
    val winNums = listOf(firstWinNum, secondWinNum)

    println("Enter the first number:")
    val firstNum = readln()?.toInt() ?: 0

    println("Enter the second number:")
    val secondNum = readln()?.toInt() ?: 0

    val resultMsg = when {
        firstNum in winNums && secondNum in winNums -> "Congratulations! You have won the grand prize!"
        firstNum in winNums || secondNum in winNums -> "You've won a consolation prize!"
        else -> "Fail!"
    }

    println(resultMsg)
    println("Winning numbers: $firstWinNum and $secondWinNum")
}