package org.example.lesson_9

fun main() {

    val ingedientsSet = mutableSetOf<String>()

    println("Введите 5 ингридиентов по одному: ")

    while (ingedientsSet.size < 5) {
        print("Ингридиент ${ingedientsSet.size + 1}: ")
        val userIngredient = readln()
        ingedientsSet.add(userIngredient)
    }
    val sortedList = ingedientsSet.sorted().toMutableList()
    sortedList[0] = sortedList[0].replaceFirstChar {
        it.uppercase()
    }
    println("Ингридиенты: ${sortedList.joinToString(", " )}")
}