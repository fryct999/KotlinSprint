package org.example.lesson_16

class Player(
    val name: String,
    var damage: Int,
    val maxHP: Int,
) {
    private var hp = maxHP
    private var canHeal = true

    private fun death() {
        canHeal = false
        damage = 0
        hp = 0

        println("$name is dead.")
    }

    fun heal(heal: Int) {
        if (!canHeal) return

        hp += heal
        if (hp > maxHP) hp = maxHP
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp <= 0) death()
    }
}

fun main() {
    val player1 = Player(name = "Dendi", damage = 10, maxHP = 150)

    player1.takeDamage(10)
    player1.takeDamage(20)
    player1.takeDamage(20)
    player1.heal(30)
    player1.takeDamage(70)
    player1.takeDamage(60)
}