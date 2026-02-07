package org.example.lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel() {

    var mainScreenState = MainScreenState()
        private set

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState)

        val screenData = "Server Data"

        mainScreenState = mainScreenState.copy(
            data = screenData,
            isLoading = false
        )
        println(mainScreenState)
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    println("${viewModel.mainScreenState}")
    viewModel.loadData()
}