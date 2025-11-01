package org.example.lesson_3

fun main() {
    val name = "Tatyana"
    val oldLastName = "Andreeva"
    val patronymic = "Sergeevna"

    val newLastName = "Sidorova"
    val ageOfChangeLastName = 22

    var ageOfRequest = 20
    println("${if (ageOfRequest < ageOfChangeLastName) oldLastName else newLastName} $name $patronymic, $ageOfRequest")

    ageOfRequest = ageOfChangeLastName
    println("${if (ageOfRequest < ageOfChangeLastName) oldLastName else newLastName} $name $patronymic, $ageOfRequest")
}