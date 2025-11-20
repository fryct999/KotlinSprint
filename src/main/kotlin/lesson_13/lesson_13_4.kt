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

}