package org.example.lesson_12

class DayWeather ( _dayTemp: Int, _nightTemp: Int, _hasPrecipitation: Boolean) {
    var dayTemp  = _dayTemp
    var nightTemp = _nightTemp
    var hasPrecipitation = _hasPrecipitation

    fun printWeather () {
        println("Днём: $dayTemp, ночью: $nightTemp, осадки: $hasPrecipitation")
    }

}

fun main() {

    val dayTemp1 = DayWeather(13, 5, false)
    val dayTemp2 = DayWeather(15, 7, true)

    dayTemp1.printWeather()
    dayTemp2.printWeather()
}