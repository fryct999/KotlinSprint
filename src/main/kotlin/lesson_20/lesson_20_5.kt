package org.example.lesson_20

class Robot() {
    private val phraseList = listOf(
        "Meatball is good",
        "Cola is nice",
        "Pasta is perfect",
        "Pizza is great",
        "Burger is delicious"
    )

    private var modifier: (String) -> String = { it }

    fun say() {
        val phrase = modifier(phraseList.random())
        println(phrase)
    }

    fun setModifier(lambda: (String) -> String) {
        modifier = lambda
    }
}

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier({
        it.split(" ").reversed().joinToString(" ")
    })
    robot.say()
}