package org.example.lesson_7

import kotlin.concurrent.thread

fun main() {
    // диапазоны (интервалы)
    val range1: IntRange = 42.. 442
    val range2: IntRange = 42 until 442
    val range3: LongRange = 42L .. 442L
    val range4: CharRange = 'a' .. 'z'
    val range5: ClosedRange<Double> = 42.1 .. 442.1
    val range6: ClosedRange<Float> = 42.1f .. 442.1f
    val range7: IntProgression = 42..442 step 2
    val range8: IntProgression = 442 downTo 42 step 2

    //in, !in
    val a = 52 in range1
    val b = 52 !in range1
    //println(a)
    //println(b)

    //for
    //break, continue, return

    for(i in 5 downTo 1) {
        if(i == 3) {
//            println("User press button \"skip\"")
//            break

//            println("i==3")
//            continue
            return
        }

        println("ADS will end in $i")
        Thread.sleep(1000)
    }

    println("Continue work app")

//    for(i in range2 step 8) {
//        println(i)
//    }
}