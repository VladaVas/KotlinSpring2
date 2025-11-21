package org.example.lesson_9

fun main() {

    println("Введитe 5 ингридиентов через запятую и пробел: ")
    val ingredientsFromUser = readln()
    val ingredientList = ingredientsFromUser.split(", ").toList()

    if (ingredientList.size != 5) {
        println("В рецепте должно быть 5 ингридиентов.")
        return
    }
    val sortedList = ingredientList.sorted()
    println("Отсортированный список ингридиентов: $sortedList")

}
