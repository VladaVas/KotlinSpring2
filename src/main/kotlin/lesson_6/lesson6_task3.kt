package org.example.lesson_6

fun main() {

    println("Введите количество секунд: ")
    val totalSeconds = readln().toInt()

    println("Таймер запущен на $totalSeconds секунд: ")

    var seconds = totalSeconds
    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло.")
}