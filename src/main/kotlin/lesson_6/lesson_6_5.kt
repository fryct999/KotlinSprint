package org.example.lesson_6

fun main() {
    println("Create user name:")
    val userName = readln()

    println("Create password:")
    val password = readln()

    println("User created success.")

    println("Enter user name:")
    var enteredUserName = readln()

    println("Enter password:")
    var enteredPassword = readln()

    while (enteredUserName != userName || enteredPassword != password) {
        println("The login or password was entered incorrect")

        println("Enter user name:")
        enteredUserName = readln()

        println("Enter password:")
        enteredPassword = readln()
    }
}