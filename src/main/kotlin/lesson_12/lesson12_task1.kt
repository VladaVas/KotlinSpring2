package org.example.lesson_12

class OneDayWeather () {
    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var hasPrecipitation: Boolean = false

    fun printWeather () {
        println("Днём: $dayTemp, ночью: $nightTemp, осадки: $hasPrecipitation")
    }

}

fun main() {

    val firstDayTemp = OneDayWeather()
    firstDayTemp.dayTemp = 13
    firstDayTemp.nightTemp = 5
    firstDayTemp.hasPrecipitation = false

    val secondDayTemp = OneDayWeather()
    secondDayTemp.dayTemp = 15
    secondDayTemp.nightTemp = 7
    secondDayTemp.hasPrecipitation = true

    firstDayTemp.printWeather()
    println()
    secondDayTemp.printWeather()
}