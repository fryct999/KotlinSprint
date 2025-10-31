package org.example.lesson_2

fun main() {
    val buffEnable = true
    val buffMining = 0.2f

    val baseCrystalMining = 7
    val baseIronMining = 11

    val buffCrystalMiningValue = baseCrystalMining * buffMining
    val buffIronMiningValue = baseIronMining * buffMining
    val buffCrystalMining = baseCrystalMining + buffCrystalMiningValue
    val buffIronMining = baseIronMining + buffIronMiningValue

    val factCrystalMining = if (buffEnable) buffCrystalMining else baseCrystalMining
    val factIronMining = if (buffEnable) buffIronMining else baseIronMining

    println("Current crystal mining - $factCrystalMining")
    println("Current iron mining - $factIronMining")
    println("Crystal buff strength - ${buffCrystalMiningValue.toInt()}")
    println("Iron buff strength - ${buffIronMiningValue.toInt()}")
}