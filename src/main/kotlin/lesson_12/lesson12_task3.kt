package org.example.lesson_12

const val DIFFERENCE_KELVIN: Int = 273

class DayWeatherKelvin1(_dayTempKelvin: Int, _nightTempKelvin: Int, _hasPrecipitationKelvin: Boolean) {
    var dayTempCelsius: Int  = _dayTempKelvin - DIFFERENCE_KELVIN
    var nightTempCelsius: Int = _nightTempKelvin - DIFFERENCE_KELVIN
    var hasPrecipitationCelsius: Boolean = _hasPrecipitationKelvin

    fun printWeather () {
        println("Днём: $dayTempCelsius, ночью: $nightTempCelsius, осадки: $hasPrecipitationCelsius")
    }
}

fun main() {

    val dayTemp3 = DayWeatherKelvin1(275, 270, true)

    val dayTemp4 = DayWeatherKelvin1(273, 268, false)

    dayTemp3.printWeather()
    dayTemp4.printWeather()

}