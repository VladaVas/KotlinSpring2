package org.example.lesson_6

fun main() {

    println("Добро пожаловать! Авторизуйтесь.")

    val registeredUser = "Zaphod"
    val registeredPassword = "PanGalactic"

    while (true) {
        println("Введите ваше имя: ")
        val userName = readln()

        println("Введите пароль: ")
        val userPassword = readln()

        if (userName == registeredUser && userPassword == registeredPassword) {
            println("Авторизация прошла успешно!")
            println("Теперь докажите, что вы не бот.")
            break
        } else {
            println("Неверное имя пользователя или пароль. Попробуйте еще раз.")
        }
    }

    var attemps = 3

    while (attemps > 0) {

        val number1 = (1..9).random()
        val number2 = (1..9).random()

        val correctAnswer = number1 + number2

        println("Чтобы доказать, что вы не бот, решите пример: $number1 + $number2.")
        println("Ваш ответ: ")
        val userAnswer = readln().toInt()

        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            break
        } else {
            attemps--
            if (attemps > 0 && userAnswer != correctAnswer) {
                println("Неверно. Попробуйте еще раз. У вас осталось $attemps попыток.")
            } else {
                println("Доступ запрещен.")
            }
        }
    }




}