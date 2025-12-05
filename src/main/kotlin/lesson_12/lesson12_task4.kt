package org.example.lesson_12

class DayWeatherKelvin(_dayTempKelvin: Int, _nightTempKelvin: Int, _hasPrecipitationKelvin: Boolean) {
    var dayTempCelsius: Int  = _dayTempKelvin - 273
    var nightTempCelsius: Int = _nightTempKelvin - 273
    var hasPrecipitationCelsius: Boolean = _hasPrecipitationKelvin

    init {
        println("Днём: $dayTempCelsius, ночью: $nightTempCelsius, осадки: $hasPrecipitationCelsius")
    }
}

fun main() {

    DayWeatherKelvin(275, 270, true)

}