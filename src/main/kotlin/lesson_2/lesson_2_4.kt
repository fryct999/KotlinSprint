package org.example.lesson_2

const val MAX_PERCENT = 100

fun main() {
    val buffMiningStrength = 20
    val buffMiningPercent = buffMiningStrength.toDouble() / MAX_PERCENT

    val baseCrystalMining = 7
    val baseIronMining = 11

    val buffCrystalMiningValue = baseCrystalMining * buffMiningPercent
    val buffIronMiningValue = baseIronMining * buffMiningPercent

    println("Crystal buff strength - ${buffCrystalMiningValue.toInt()}")
    println("Iron buff strength - ${buffIronMiningValue.toInt()}")
}