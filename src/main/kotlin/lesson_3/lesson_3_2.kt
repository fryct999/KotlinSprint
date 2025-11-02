package org.example.lesson_3

fun main() {
    val name = "Tatyana"
    var lastName = "Andreeva"
    val patronymic = "Sergeevna"

    var ageOfRequest = 20
    println("$lastName $name $patronymic, $ageOfRequest")

    lastName = "Sidorova"
    ageOfRequest = 22
    println("$lastName $name $patronymic, $ageOfRequest")
}