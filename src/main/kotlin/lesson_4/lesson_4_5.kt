package org.example.lesson_4

const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val MIN_PROVISION_BOXES = 50

fun main() {
    println("Is there any damage to the ship? (true or false)")
    val hullIsDamaged: Boolean? = readlnOrNull()?.toBooleanStrictOrNull()

    if (hullIsDamaged == null) {
        println("Incorrect damage data has been entered")
        return
    }

    println("Enter the current number of crew.")
    val crewNum: Int? = readlnOrNull()?.toIntOrNull()

    if (crewNum == null || crewNum < 0) {
        println("Incorrect information about the number of crew.")
        return
    }

    println("Enter the current number of provision boxes.")
    val countProvisionBox: Int? = readlnOrNull()?.toIntOrNull()

    if (countProvisionBox == null || countProvisionBox < 0) {
        println("Incorrect information about the provision boxes.")
        return
    }

    println("The weather conditions are favorable now? (true or false)")
    val favorableWeather : Boolean? = readlnOrNull()?.toBooleanStrictOrNull()

    if (favorableWeather == null) {
        println("Incorrect damage data has been entered")
        return
    }

    val readyToSailMsg = "The ship is ready to sail: %b"

    println(readyToSailMsg.format(
        countProvisionBox > MIN_PROVISION_BOXES &&
                ((!hullIsDamaged && crewNum in MIN_CREW_SIZE .. MAX_CREW_SIZE) ||
                (crewNum == MAX_CREW_SIZE && favorableWeather))
    ))
}