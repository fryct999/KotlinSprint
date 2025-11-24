package org.example.lesson_15

abstract class ForumUser(
    val name: String,
) {
    abstract fun readForum()
    abstract fun writeMessage()
}

class DefaultUser(
    name: String,
) : ForumUser(name) {
    override fun readForum() {
        println("Default user reads the forum.")
    }

    override fun writeMessage() {
        println("Default user writes messages.")
    }
}

class AdminUser(
    name: String,
) : ForumUser(name) {
    override fun readForum() {
        println("Administrator user reads the forum.")
    }

    override fun writeMessage() {
        println("Administrator user writes messages.")
    }

    fun deleteUser(user: DefaultUser) {
        println("Remove user: ${user.name}.")
    }

    fun deleteMessage(message: String) {
        println("Remove $message.")
    }
}