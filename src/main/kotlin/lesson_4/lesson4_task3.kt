package org.example.lesson_4

const val SUNNY_WEATHER = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val CURRENT_SEASON = "зима"

fun main() {

    val isFavorable = SUNNY_WEATHER &&
            IS_TENT_OPEN &&
            HUMIDITY == 20 &&
            CURRENT_SEASON != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}