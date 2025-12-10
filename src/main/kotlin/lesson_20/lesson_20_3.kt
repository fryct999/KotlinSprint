package org.example.lesson_20

class Player203(
    val name: String,
    var hasKey: Boolean = false,
)

fun main() {
    val ply1 = Player203("Lambert")
    val ply2 = Player203("Leto", true)

    val openDoorLambda = { ply: Player203 ->
        if (ply.hasKey) "${ply.name} opened the door."
        else "The door is closed."
    }

    println(openDoorLambda(ply1))
    println(openDoorLambda(ply2))
}