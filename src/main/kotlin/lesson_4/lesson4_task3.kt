package org.example.lesson_4

fun main() {

    val sunnyWeather = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    val isFavorable = sunnyWeather &&
            isTentOpen &&
            humidity == 20 &&
            currentSeason != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}