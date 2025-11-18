package org.example.lesson_11

class User2(
    val id: Int,
    val name: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun changePassword() {
        println("Enter old password:")
        val oldPass = readln()

        if (oldPass == password) {
            println("Enter new password:")
            password = readln()
            println("Password successfully changed.")
        }
        else println("Password incorrect.")
    }

    fun addDataInBio() {
        println("Add extra data:")
        bio += readln()
    }

    fun getUserData() {
        println("User id: $id, name: $name, password: $password, email: $email, bio: $bio")
    }
}

fun main() {
    val user = User2(1, "Nurgl", "1q2w3e4r5t", "chaosgarden@nurgl.com")

    user.addDataInBio()
    user.changePassword()

    println(user.getUserData())
}