package org.example.lesson_20

fun main() {
    val elements = listOf("Main", "Order", "Menu", "Contacts", "Deliver", "Reviews", "Account")
    val lambdsMap = elements.map { { println("The item is pressed: $it") } }

    for (i in lambdsMap.indices step 2) {
        lambdsMap[i]()
    }
}