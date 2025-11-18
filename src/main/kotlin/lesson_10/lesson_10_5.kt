package org.example.lesson_10

const val USER_LOGIN = "Fryct999"
const val USER_PASS = "1q2w3e4r5t"
const val TOKEN_LENGTH = 32

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
    println("Contents of the shopping cart: $cart.")
}

fun userAuthorization(userLogin: String, userPassword: String) : String? {
    if (userLogin == USER_LOGIN && userPassword == USER_PASS) {
        return generateToken()
    }
    else return null
}

fun generateToken() : String {
    val numRange = 0..9
    val charRange = 'a' .. 'z'
    val pointerList = listOf("Num", "Char", "UChar")
    var token = ""

    for (i in 0 until TOKEN_LENGTH) {
        when(pointerList.random()) {
            pointerList[0] -> token += numRange.random().toString()
            pointerList[1] -> token += charRange.random().toString()
            else -> token += charRange.random().uppercaseChar().toString()
        }
    }

    return token
}

fun getShoppingCart(token: String) : List<String> {
    return listOf("Mouse", "Keyboard", "GPU", "CPU fun cooler")
}