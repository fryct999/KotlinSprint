package org.example.lesson_11

class ForumUser(
    val userId: Int,
    val userName: String,
) {}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {}

class Forum(
    val usersList: MutableList<ForumUser> = mutableListOf(),
    val forumThread: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(userName: String): ForumUser {
        val id = usersList.size + 1
        val newUser = ForumUser(id, userName)
        usersList.add(newUser)

        return newUser
    }

    fun createNewMessage(userId: Int, message: String) {
        if (!usersList.any { it.userId == userId }) return

        forumThread.add(ForumMessage(userId, message))
    }

    fun printThread() {
        forumThread.forEach { fmsg ->
            val user = usersList.find { it.userId == fmsg.authorId }

            println("${user?.userName}: ${fmsg.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Lotar")
    val user2 = forum.createNewUser("MainHero")

    forum.createNewMessage(user2.userId, "Good.")
    forum.createNewMessage(user2.userId, "How can I get armor like yours?")
    forum.createNewMessage(user1.userId, "WHAT?! I'll take that as an insult.")
    forum.createNewMessage(user1.userId, "You're not even a member of the militia, you're not even a citizen.")

    forum.printThread()
}