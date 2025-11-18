package org.example.lesson_11

class User3(
    val avatar: Any,
    val name: String,
    var status: String,
) {}

class VoiceRoom(
    val avatar: Any,
    val name: String,
    val usersList: MutableList<User3>
) {
    val statusList = listOf("Speaking", "User muted", "Microphone muted")

    fun addNewUser(user: User3) {
        usersList.add(user)
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
    val user1 = User3(404, "Lee", "Speaking")
    val user2 = User3(404, "Lars", "Microphone muted")
    val room1 = VoiceRoom(404, "Old camp", mutableListOf(user1, user2))
}