package org.example.lesson_8

fun main() {

    val listOfIngridients = arrayListOf("творог", "рисовая мука", "яйцо", "ванилин", "сахар")
    println("Список ингридиетов: $listOfIngridients")

    println("Введите ингридет, который вы хотите заменить: ")
    val ingridientSearch = readln()

    if (ingridientSearch in listOfIngridients) {
        println("Введите ингридиет, который вы хотели бы добавить: ")
        val ingridientFromUser = readln()

        val index = listOfIngridients.indexOf(ingridientSearch)
        listOfIngridients[index] = ingridientFromUser
        println("Готово! Вы сохранили следующий список: $listOfIngridients")
    } else {
        println("Такого ингредиента в рецепте нет.")

    }
}