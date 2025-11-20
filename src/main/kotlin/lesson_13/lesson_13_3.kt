package org.example.lesson_13

class Contact3(
    val phoneNumber: Long,
    val name: String,
    val company: String? = null,
) {
    fun printContactData() {
        println("Name: $name \n Phone number: $phoneNumber \n Company: ${company ?: "<Not data>"}")
    }
}

fun main() {
    val phoneBook = listOf<Contact3>(
        Contact3(79999999999, "Tom", null),
        Contact3(79999999998, "Jerry", null),
        Contact3(79999999997, "Tinki", "null"),
        Contact3(79999999996, "Vinki", "Burger shot"),
        Contact3(79999999995, "Po", "IKEA"),
    )

    phoneBook.forEach {
        if (it.company != null) println(it.company)
    }
}