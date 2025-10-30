package org.example.lesson_5

fun main() {

    val number1 = 2
    val number2 = 2
    val rightAnswer = number1 + number2

    println("Напишите решение примера: $number1 + $number2 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == rightAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}