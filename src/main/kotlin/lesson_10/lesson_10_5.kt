package org.example.lesson_10

const val USER_LOGIN = "Fryct999"
const val USER_PASS = "1q2w3e4r5t"
const val TEST_TOKEN = "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpX"

fun main() {
    println("Enter user name:")
    val userLogin = readln()

    println("Enter password:")
    val userPass = readln()

    val userToken = userAuthorization(userLogin, userPass)
    if (userToken == null) {
        println("Invalid username or password.")
        return
    }

    val cart = getShoppingCart(userToken)
    if (cart == null) println("Cart is empty.")
    else println("Contents of the shopping cart: $cart.")
}

fun userAuthorization(userLogin: String, userPassword: String) : String? {
    if (userLogin == USER_LOGIN && userPassword == USER_PASS) {
        return TEST_TOKEN
    }
    else return null
}

fun getShoppingCart(token: String) : List<String>? {
    if (token == TEST_TOKEN) return listOf("Mouse", "Keyboard", "GPU", "CPU fun cooler")
    else return null
}