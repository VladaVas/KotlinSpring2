package org.example.lesson_9

fun main() {

    val listOfIngridients = mutableListOf(
        "мука",
        "яйца",
        "молоко"
    )
    println("В рецепте есть базовые ингредиенты: $listOfIngridients")

    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {

        println("Какой ингредиент вы хотите добавить?")
        val userInput = readln()
        listOfIngridients.add(userInput)

    } else if (userAnswer.equals("нет", ignoreCase = true)) {
        println("До свидания!")
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngridients")
}