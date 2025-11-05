package org.example.lesson_5

fun main() {
    val userNameList = listOf("Zaphod",)
    val userPasswordMap = mapOf("Zaphod" to "PanGalactic",)

    println("Enter your username:")
    val userName = readLine()

    println("Enter your password:")
    val password = readLine()

    if (userNameList.any { it == userName}) {
        if (userPasswordMap[userName] == password) println("The data is correct! Welcome aboard $userName!")
        else println("You entered the wrong password!")
    } else {
        println("The user with login $userName has not been found! Do you want to register?")
        return
    }
}