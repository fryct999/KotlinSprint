package org.example.lesson_18

abstract class Dice() {
    protected abstract val face: Int

    fun getResult(): Int {
        return (0..face).random()
    }
}

class Dice4() : Dice() {
    override val face = 4
}

class Dice6() : Dice() {
    override val face = 6
}

class Dice8() : Dice() {
    override val face = 8
}

fun main() {
    val dice1 = Dice4()
    val dice2 = Dice6()
    val dice3 = Dice8()

    val diceList: List<Dice> = listOf(dice1, dice2, dice3)
    diceList.forEach {
        println(it.getResult())
    }
}