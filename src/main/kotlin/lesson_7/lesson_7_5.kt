package org.example.lesson_7

fun main() {
    val minPassLength = 6

    println("Enter the password length (the minimum length is $minPassLength characters):")
    var userPassLength = readln().toInt()

    while (userPassLength < minPassLength) {
        println("You have entered a number less than the minimum size of $minPassLength. Enter a new length:")
        userPassLength = readln().toInt()
    }

    val passRange = 0 until userPassLength
    val numRange = 0 .. 9
    val charRange = 'a' .. 'z'
    val pass = Array<String>(userPassLength) {""}

    val numPosition = passRange.random()
    val charPosition = passRange.filter { it != numPosition }.random()
    val upCharPosition = passRange.filter { it != numPosition && it != charPosition }.random()

    val pointersArray = arrayOf("Num", "Char", "UChar")

    for (i in passRange) {
        val point = when(i) {
            numPosition -> pointersArray[0]
            charPosition -> pointersArray[1]
            upCharPosition -> pointersArray[2]
            else -> pointersArray.random()
        }

        pass[i] = when(point) {
            pointersArray[0] -> numRange.random().toString()
            pointersArray[1] -> charRange.random().toString()
            else -> charRange.random().uppercaseChar().toString()
        }
    }

    println("Generated password - ${pass.joinToString(separator = "", prefix = "", postfix = "")}")
}