package org.example.lesson_20

class Player202(
    val name: String,
    var hp: Int,
    val maxHp: Int = 100
)

fun main() {
    val player = Player202("Link", 30);
    val healthPotionLambda = { ply: Player202 ->
        println("${ply.name} uses a healing potion.")
        println("${ply.name} regained ${ply.maxHp - ply.hp} health points.")

        ply.hp = ply.maxHp
    }

    healthPotionLambda(player)
}