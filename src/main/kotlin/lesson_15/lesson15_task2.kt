package org.example.lesson_15

abstract class WeatherStationStats

class Temperature(
    val temperature: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats()

class WeatherServer {

    fun sendMessage(stats: WeatherStationStats) {
        val message = when (stats) {
            is Temperature -> "Temperature: ${stats.temperature}°C"
            is PrecipitationAmount -> "Precipitation: ${stats.precipitationAmount}"
            else -> "Неизвестный тип данных"
        }
        println(message)
        }
        }


    fun main() {
        val server = WeatherServer()
        val temperature = Temperature(10)
        val precipitationAmount = PrecipitationAmount(16)

        server.sendMessage(temperature)
        server.sendMessage(precipitationAmount)

    }