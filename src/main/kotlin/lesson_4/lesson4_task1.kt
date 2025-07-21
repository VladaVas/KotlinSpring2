package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = bookedToday < NUMBER_OF_TABLES
    val availableTomorrow = bookedTomorrow < NUMBER_OF_TABLES

    println("[Доступность столиков на сегодня: $availableToday]\n[Доступность стоилков на завтра: $availableTomorrow]")

}