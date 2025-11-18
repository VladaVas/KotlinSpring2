package org.example.lesson_8

fun main() {

    val listOfIngridients = arrayOf("творог", "рисовая мука", "яйцо", "ванилин", "сахар")

    println("Введите ингридет для поиска: ")
    val ingridientSearch = readln()

    if (ingridientSearch in listOfIngridients) {
        println("Ингредиент $ingridientSearch в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}