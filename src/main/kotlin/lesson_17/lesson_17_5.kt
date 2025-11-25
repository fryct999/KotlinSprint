package org.example.lesson_17

class User_17_5(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            field = value
            println("Login has been successfully replaced with: $value.")
        }

    var password: String = password
        get() {
            return field.replace(Regex("."), "*")
        }
        set(value) {
            println("You can't replace the password.")
        }
}

fun main() {
    val user1 = User_17_5(login = "Kronos", password = "tetriandoch")
    user1.login = "KronosS"
    user1.password = "1235"
    println(user1.password)
}