package org.example.lesson_8

fun main() {

    val listOfIngridients = arrayListOf("творог", "рисовая мука", "яйцо", "ванилин", "сахар")

    println("Введите ингридет для поиска: ")
    val ingridientSearch = readln()

    for (ingridient in listOfIngridients) {
        if(ingridient == ingridientSearch) {
            println("Ингредиент $ingridientSearch в рецепте есть.")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")

}