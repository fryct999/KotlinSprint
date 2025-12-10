package org.example.lesson_21

class Player213(
    val name: String,
    var hp: Int,
    val maxHp: Int = 100
)

fun Player213.isHealthy(): Boolean {
    return this.hp == this.maxHp
}

fun main() {
    val ply1 = Player213("Alex", 30)
    val ply2 = Player213("Borka", 100)

    println(ply1.isHealthy())
    println(ply2.isHealthy())
}