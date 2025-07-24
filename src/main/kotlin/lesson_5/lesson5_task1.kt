package org.example.lesson_5

const val RIGHT_ANSWER = 4
fun main() {

    val number1 = 2
    val number2 = 2

    println("Напишите решение примера: $number1 + $number2 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == RIGHT_ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}