package org.example.lesson_7

fun main() {

    val codeDigits = (1000..9999).random()
    println("Ваш код авторизации: $codeDigits")

     do {
         println("Введите код из СМС: ")
         val userCode = readln().toInt()

         if (userCode == codeDigits) {
             println("Добро пожаловать!")
             return
         }
     } while (userCode != codeDigits)
    }