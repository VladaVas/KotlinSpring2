package org.example.lesson_7

fun main() {

    println("Введите количество секунд:")
    val userInput = readln().toInt()

    for (i in userInput downTo 1) {
           println("Осталось $i секунд.")
        Thread.sleep(1000)
        }
println("Время вышло.")
    }