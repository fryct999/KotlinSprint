package org.example.lesson_2

fun main() {
    val buffMiningStrength = 20
    val buffMiningPercent = buffMiningStrength.toFloat() / 100

    val baseCrystalMining = 7
    val baseIronMining = 11

    val buffCrystalMiningValue = baseCrystalMining * buffMiningPercent
    val buffIronMiningValue = baseIronMining * buffMiningPercent

    println("Crystal buff strength - ${buffCrystalMiningValue.toInt()}")
    println("Iron buff strength - ${buffIronMiningValue.toInt()}")
}