package org.example.lesson_12

const val differenceKelvin = 273

class DayWeatherKelvin(_dayTempKelvin: Int, _nightTempKelvin: Int, _hasPrecipitationKelvin: Boolean) {
    var dayTempCelsius: Int  = _dayTempKelvin - differenceKelvin
    var nightTempCelsius: Int = _nightTempKelvin - differenceKelvin
    var hasPrecipitationCelsius: Boolean = _hasPrecipitationKelvin

    fun printWeather () {
        println("Днём: $dayTempCelsius, ночью: $nightTempCelsius, осадки: $hasPrecipitationCelsius")
    }
}

fun main() {

    val dayTemp3 = DayWeatherKelvin(275, 270, true)

    val dayTemp4 = DayWeatherKelvin(273, 268, false)

    dayTemp3.printWeather()
    dayTemp4.printWeather()

}