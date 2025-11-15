package org.example.lesson_8

fun main() {
    val arrayOfIngredients: Array<String> = arrayOf("Egg", "Tomato", "Green", "Salt", "Pepper")

    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray1: CharArray = charArrayOf('4', '4', '2')

    //val intArray2 = arrayOf()
    var intArray3 = intArrayOf(2, 3, 4, 5)
    intArray3 = intArrayOf(2, 3, 4, 5)

//    println("Array size ${arrayOfIngredients.size}")
//
//    println(arrayOfIngredients.indexOf("Tomato"))
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])
//
//    arrayOfIngredients[4] = "Paprika"
//    println(arrayOfIngredients[4])
//
//    arrayOfIngredients.set(1, "Cabbage")
//    println(arrayOfIngredients.get(1))

    for (i in arrayOfIngredients) {
        println("Ingredient ${arrayOfIngredients.indexOf(i) + 1} $i")
    }
}