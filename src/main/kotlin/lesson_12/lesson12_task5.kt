package org.example.lesson_12

const val DIFFERENCE_KELVIN = 273

class DayWeatherKelvin(_dayTempKelvin: Int, _nightTempKelvin: Int, _hasPrecipitationKelvin: Boolean) {
    var dayTempCelsius: Int  = _dayTempKelvin - DIFFERENCE_KELVIN
    var nightTempCelsius: Int = _nightTempKelvin - DIFFERENCE_KELVIN
    var hasPrecipitationCelsius: Boolean = _hasPrecipitationKelvin

    init {
        println("Днём: $dayTempCelsius, ночью: $nightTempCelsius, осадки: $hasPrecipitationCelsius")
    }
}

fun main() {

    val sensorData = mutableListOf<DayWeatherKelvin>()

    for (i in 1..30) {
        val today = DayWeatherKelvin(
            (260..310).random(),
            (260..310).random(),
            listOf(true, false).random()
        )
        sensorData.add(today)
    }

    val dayTemp = sensorData.map { it.dayTempCelsius }
    val nightTemp = sensorData.map { it.nightTempCelsius }
    val avgDay = dayTemp.average().toInt()
    val avgNight = nightTemp.average().toInt()

    val percipitationDay = sensorData.count{ it.hasPrecipitationCelsius }

    println("Средняя дневная температура: $avgDay")
    println("Средняя ночная температура: $avgNight")
    println("Количество дней с осадками: $percipitationDay")

}