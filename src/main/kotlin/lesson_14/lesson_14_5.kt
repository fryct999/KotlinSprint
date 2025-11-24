package org.example.lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String,
) {}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentId: Int
) : Message(id, author, text) {}

class Chat(
    val messageLog: MutableList<Message>,
) {
    fun addMessage(_author: String, _text: String) {
        messageLog.add(Message(id = messageLog.size, author = _author, text = _text))
    }

    fun addThreadMessage(_author: String, _text: String, _parentId: Int) {
        messageLog.add(ChildMessage(id = messageLog.size, author = _author, text = _text, parentId = _parentId))
    }

    fun printChat() {
        val chatLog = messageLog.groupBy { if (it is ChildMessage) it.parentId else it.id }

        chatLog.forEach { msgList ->
            msgList.value.forEach {
                if (it is ChildMessage) println("\t ${it.author}: ${it.text}")
                else println("${it.author}: ${it.text}")
            }
        }
    }
}

fun main() {
    val chat = Chat(mutableListOf())

    chat.addMessage("author1", "message 1")
    chat.addMessage("author2", "message 2")
    chat.addMessage("author3", "message 3")
    chat.addMessage("author4", "message 4")
    chat.addThreadMessage("author1", "message 5", 1)
    chat.addThreadMessage("author2", "message 6", 1)
    chat.addMessage("author1", "message 7")
    chat.addMessage("author4", "message 8")
    chat.addThreadMessage("author4", "message 9", 3)
    chat.addThreadMessage("author4", "message 10", 3)

    chat.printChat()
}