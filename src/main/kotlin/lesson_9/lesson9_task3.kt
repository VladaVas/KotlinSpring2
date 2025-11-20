package org.example.lesson_9

fun main() {

    val omletIngridients = listOf(2, 50, 15)

     println("Введите количество проций: ")
    val countOfPortions = readln().toInt()

    val totalEggs = omletIngridients[0] * countOfPortions
    val totalMilk = omletIngridients[1] * countOfPortions
    val totalButter = omletIngridients[2]*countOfPortions

    println("На $countOfPortions порций вам понадобится: Яиц – $totalEggs, молока – $totalMilk, сливочного масла – $totalButter")


}