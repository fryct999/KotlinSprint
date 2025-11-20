package org.example.lesson_13

fun main() {
    // NullPointerException (NPE) исключение нулевого указателя
    // null

    val nullableString: String? = null

    println(nullableString?.length)
//    if (nullableString != null) println(nullableString)
//    else println("Variable equals null.")

//    val nullableLine: String? = readLine()

//    val stringLength: Int = nullableString?.length ?: 0
//    println(stringLength)

    val strLength: Int = nullableString!!.length // гарантирует что не null
}