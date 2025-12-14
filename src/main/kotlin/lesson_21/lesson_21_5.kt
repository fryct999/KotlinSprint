package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String? {
    return maxByOrNull { it.value }?.key
}

class Player215 {
    val skillProgression = mapOf(
        "Strength" to 5,
        "Agility" to 4,
        "Intelligence" to 0,
        "Charisma" to 5,
    )
}

fun main() {
    val ply = Player215()
    println(ply.skillProgression.maxCategory())
}