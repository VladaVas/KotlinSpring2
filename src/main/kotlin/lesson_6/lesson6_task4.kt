package org.example.lesson_6

fun main () {

    val randomNumber = (1..9).random()
    var attempts = 5

    println("Угадай число от 1 до 9! У тебя $attempts попыток.")

    while (attempts > 0) {
        println("Введи число: ")
        val userNumber = readln().toInt()

        if (userNumber == randomNumber) {
            println("Это была великолепная игра! Ты угадал число $randomNumber!")
            return
        }
        attempts--
        if (attempts > 0){
            println("Неверно. Попробуй еще раз. У тебя осталось $attempts попыток")
        }
    }
    println("Попытки закончились! Было загадано число: $randomNumber.")
}