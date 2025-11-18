package org.example.lesson_8

fun main() {

    val listOfIngridients = arrayOf("творог", "рисовая мука", "яйцо", "ванилин", "сахар")
    println("Список ингридиетов: ${listOfIngridients.joinToString(", ")}")

    println("Введите ингридет, который вы хотите заменить: ")
    val ingridientSearch = readln()
    val index = listOfIngridients.indexOf(ingridientSearch)

    if (index >= 0) {
        println("Введите ингридиет, который вы хотели бы добавить: ")
        val ingridientFromUser = readln()

        listOfIngridients[index] = ingridientFromUser
        println("Готово! Вы сохранили следующий список: ${listOfIngridients.joinToString(", ")}")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}