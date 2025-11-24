package org.example.lesson_11

class User3(
    val avatar: String,
    val name: String,
    val id: Int,
    var status: String,
) {}

class VoiceRoom(
    val avatar: String,
    val name: String,
    val usersList: MutableList<User3>
) {
    val statusList = listOf("Speaking", "User muted", "Microphone muted")

    fun addNewUser(user: User3) : Boolean {
        val hasUser = usersList.find { it.id == user.id }

        if (hasUser != null) return false

        usersList.add(user)
        return true
    }

    fun changeUserStatus(userName: String, status: String): Boolean {
        val user = usersList.find { it.name == userName }
        if (user != null && statusList.contains(status)) {
            user.status = status

            return true
        }

        return false
    }
}

fun main() {
    val user1 = User3(avatar = "image URL", name = "Lee", id = 1, status = "Speaking")
    val user2 = User3(avatar = "image URL", name = "Lars", id = 2, status = "Microphone muted")
    val room1 = VoiceRoom(avatar = "image URL", name = "Old camp", usersList = mutableListOf<User3>())

    room1.addNewUser(user1)
    room1.addNewUser(user2)
}