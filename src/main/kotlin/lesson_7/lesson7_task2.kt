package org.example.lesson_7

fun main() {

   for (attempt in 1..5) {
       val codeDigits = (1000..9999).random()
       println("Ваш код авторизации: $codeDigits")

       println("Введите код из СМС: ")
       val userCode = readln()

       if (userCode == codeDigits.toString()) {
           println("Добро пожаловать!")
           return
       } else {
           println("Неверный код.")
       }
       }
    println("Попытки закончились. Доступ запрещён.")
   }