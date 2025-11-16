package org.example.lesson_9

fun main() {
    // List - список, упорядоченный набор элементов, обращение по индексам, могут быть дубликаты
    // Set - множество, коллекция уникальных элементов, без дубликатов, порядок элементов любой
    // Map - словарь или ассоциативный список, набор пар (ключ - значение), ключи уникальны, значения могут повторяться

    // Array<T> - массив представлен классом фикс. размер, массивы оптимизированы для примитивов
    // List<T> - интерфейс с различными реализация и своим функционалом
    // отличается процесс сравнивания, в массиве сравниваются адреса ячеек в памяти, в списках значение.

    val list: List<Int> = listOf(4, 4, 2)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)

    val mutableList = mutableListOf(11, 15, 20, 12, 9)
    //println(mutableList)

    mutableList.add(42)
    //println(mutableList)

    mutableList.add(0, 42)
    println(mutableList)

    //println(mutableList.contains(42))
    //println(mutableList.isEmpty())
    //println(mutableList.isNotEmpty())

    //println(mutableList.indexOf(42))
    //println(mutableList.lastIndexOf(42))

    mutableList.sort()
    mutableList.sortDescending()
    mutableList.reverse()
    //println(mutableList)

    mutableList.forEach { num: Int -> // change it
        //println(num)
    }

    // интервал - for
    // коллекция - foreach
    // break, continue - for

    val mutableList2 = mutableList.filter {
        it == 42
    }

    //mutableList2.forEach { println(it) }
    val mutableList3 = mutableList2.map {
        it * 2
    }

    mutableList3.forEach { println(it) }
}