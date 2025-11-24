package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val hasLandingPossible: Boolean,
)

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    hasLandingPossible: Boolean,
) : CelestialBody(name, hasAtmosphere, hasLandingPossible) {}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    hasLandingPossible: Boolean,
    val moonList: List<Moon>,
) : CelestialBody(name, hasAtmosphere, hasLandingPossible) {
    fun printData() {
        println("Planet $name has ${moonList.size} satellite: ${moonList.joinToString(separator = ", ") { it.name }}")
    }
}

fun main() {
    val moon1 = Moon(name = "moon1", hasAtmosphere = false, hasLandingPossible = true)
    val moon2 = Moon(name = "moon2", hasAtmosphere = true, hasLandingPossible = false)
    val planet1 = Planet(name = "planet1", hasAtmosphere = true, hasLandingPossible = false, moonList = listOf(moon1, moon2))

    planet1.printData()
}