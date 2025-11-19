package org.example.lesson_8

fun main() {

    println("Напишите количество планируемых ингридиентов: ")
    val countOfIngridients = readln().toInt()

    val ingridients = Array(countOfIngridients) { "" }

    for (i in ingridients.indices) {
        println("Введите ингредиент №${i + 1}:")
        ingridients[i] = readln()
    }
    println("Ваш список ингридиентов: ${ingridients.joinToString(", ")}")

}