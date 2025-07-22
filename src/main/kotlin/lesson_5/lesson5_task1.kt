package org.example.lesson_5

const val RIGHT_ANSWER = 4
fun main() {

    println("Напишите резение примера: 2 + 2 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == RIGHT_ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}