package org.example.lesson_9

fun main() {

    val omletIngridients = listOf(2, 50, 15)

    println("Введите количество проций: ")
    val countOfPortions = readln().toInt()

    val totalPortions = omletIngridients.map { it * countOfPortions }

    println("На $countOfPortions порций вам понадобится: Яиц – ${totalPortions[0]}, молока – ${totalPortions[1]}, сливочного масла – ${totalPortions[2]}.")

}