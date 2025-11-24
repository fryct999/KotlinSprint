package org.example.lesson_16

fun main() {
    // public - по умолчанию, доступ откуда угодно
    // private - доступны только в рамках файла или класса
    // protected - видны в классе и в классе наследников
    // internal - видны в любой части модуля

    // Инкапсуляция - упаковка данных и функций для работы с ними внутрь общего компонента.
    // Это механизм для пресечения прямого доступа из вне к определенным атрибутам компонента.

    val guide = HitchhikerGuide()
//    guide.title = "Don't panic."
//    guide.chooseArticle()
    println(guide.getNumberOfPages())
    guide.setNumberOfPages(42000)
    println(guide.getNumberOfPages())

    Support().printInfo()
}