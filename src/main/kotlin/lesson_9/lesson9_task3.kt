package org.example.lesson_9

fun main() {

    val omletIngridients = listOf(2, 50, 15)

     println("Введите количество проций: ")
    val countOfPortions = readln().toInt()

    val eggs = omletIngridients.filter {
        it == omletIngridients[0]
    }
    val totalEggs = eggs.map { it * countOfPortions }

    val milk = omletIngridients.filter {
        it == omletIngridients[1]
    }
    val totalMilk = milk.map { it * countOfPortions}

    val butter = omletIngridients.filter {
        it == omletIngridients[2]
    }
    val totalButter = butter.map { it * countOfPortions}

    println("На $countOfPortions порций вам понадобится: Яиц – $totalEggs, молока – $totalMilk, сливочного масла – $totalButter")


}