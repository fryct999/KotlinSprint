package org.example.lesson_10

const val MIN_LENGTH_USER_DATA = 4

fun main() {
    println("Enter your username:")
    val login = readln()

    println("Enter your password:")
    val pass = readln()

    if (verifyingUserData(login, pass))
        println("Welcome!")
    else
        println("The username or password is not long enough.")
}

fun verifyingUserData(userName: String, userPass: String) : Boolean {
    if (userName.length >= MIN_LENGTH_USER_DATA && userPass.length >= MIN_LENGTH_USER_DATA) return true
    else return false
}