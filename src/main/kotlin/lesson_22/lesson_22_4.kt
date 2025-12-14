package org.example.lesson_22

class MainScreenViewModel {
    private data class MainScreenState(
        val data: String? = null,
        val isLoading: Boolean = false,
    )

    private var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy("missing data", false)
        println(mainScreenState)

        mainScreenState = mainScreenState.copy("uploading data", false)
        println(mainScreenState)

        Thread.sleep(1000)
        mainScreenState = mainScreenState.copy("uploading data", true)
        println(mainScreenState)
    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}