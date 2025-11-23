package org.example.lesson_13

class Contact2(
    val phoneNumber: Long,
    val name: String,
    val company: String? = null,
) {
    fun printContactData() {
        println("Name: $name \n Phone number: $phoneNumber \n Company: ${company ?: "<Not data>"}")
    }
}

fun main() {
    val contact1 = Contact2(79999999999, "Jarvis")
    contact1.printContactData()
}