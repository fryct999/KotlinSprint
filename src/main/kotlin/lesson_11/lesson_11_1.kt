package org.example.lesson_11

class User(
    val id: Int,
    val name: String,
    val password: String,
    val email: String,
) {
    fun getUserData(): String {
        return "User name: $name, id: $id, password: $password, email: $email"
    }
}

fun main() {
    val user1 = User(1, "Biba", "1q2w3e4r5t", "bibamail@mail.ru")
    val user2 = User(2, "Boba", "12345qwert", "bobamail@mail.ru")

    println(user1.getUserData())
    println(user2.getUserData())
}