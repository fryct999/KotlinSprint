package org.example.lesson_16

class User(
    val login: String,
    private val password: String,
) {
    fun validation(password: String): Boolean {
        return this.password == password
    }
}

fun main() {
    val user1 = User(login = "Higart", password = "1q2w3e4r5t")

    println("Enter password:")
    val pass = readln()

    if (user1.validation(pass)) println("Password correct!")
    else println("Password incorrect!")
}