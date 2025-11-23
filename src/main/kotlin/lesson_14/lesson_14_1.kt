package org.example.lesson_14

fun main() {

    // название, скорость, беспилотник
    // варп-режим, диагностика системы
    // разведчик, индустриальный

//    val ship1 = Spaceship(name = "Ship1", speed = 400)
//    ship1.runSystemDiagnostic()
//    ship1.switchToWarpMode()
//    println()

    val scout1 = Scout(name = "Scout1", speed = 750, radarRange = 300, afterburnerSpeed = 1000)
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.runAfterburner()
    scout1.handleDataFromRadar()
    println(scout1.unmanned)
    println()

    val industrial1 = Industrial(name = "industrial1", speed = 250, numberOfMiners = 3)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)
    println()
}