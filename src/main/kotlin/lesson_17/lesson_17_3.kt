package org.example.lesson_17

class Folder(
    name: String,
    countFiles: Int,
    isSecret: Boolean,
) {
    val name = name
        get() = if (isSecret) "hidden folder" else field

    val countFiles = countFiles
        get() = if (isSecret) 0 else field

    val isSecret = isSecret
}

fun main() {
    val folder1 = Folder(name = "Download", countFiles = 3, isSecret = false)
    println(folder1.name)
    println(folder1.countFiles)

    val folder2 = Folder(name = "Personal", countFiles = 6, isSecret = true)
    println(folder2.name)
    println(folder2.countFiles)
}