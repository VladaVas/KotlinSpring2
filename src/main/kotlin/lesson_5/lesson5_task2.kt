package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2025

    println("Введите ваш год рождения:")
    val birthYear = readln().toInt()

    val userAge = currentYear - birthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }

}