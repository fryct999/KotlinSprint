package org.example.lesson_16

private val supportInfo = "Support Info"

class HitchhikerGuide {
    var title = ""
    private var numberOfPages = 9999

    private fun chooseArticle() {
        println("Open catalog.")
    }

    fun getNumberOfPages() = numberOfPages
    fun setNumberOfPages(number: Int) {
        numberOfPages = number
    }
}

class Support {
    fun printInfo() {
        println(HitchhikerGuide::class.simpleName)
        println(HitchhikerGuide().title)
        println(supportInfo)
    }
}