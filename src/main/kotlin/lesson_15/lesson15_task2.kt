package org.example.lesson_15

abstract class WeatherStationStats()

class Temperature(
    val temperature: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats()

class WeatherServer {

    fun sendMessage(stats: WeatherStationStats) {
        if (stats is Temperature) {
            println("Temperature: ${stats.temperature}°C")
        } else if (stats is PrecipitationAmount) {
            println("Precipitation: ${stats.precipitationAmount}")
        }
    }
}

fun main() {
    val server = WeatherServer()
    val temperature = Temperature(10)
    val precipitationAmount = PrecipitationAmount(16)

    server.sendMessage(temperature)
    server.sendMessage(precipitationAmount)

}