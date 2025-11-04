package org.example.lesson_6

fun main() {

    println("Введите количество секунд: ")
    val totalSeconds = readln().toInt()

    println("Таймер запущен на $totalSeconds секунд: ")

    var seconds = totalSeconds
    while (seconds > 0) {
        println("${seconds--}")
        Thread.sleep(1000)
    }

    println("Прошло $totalSeconds секунд.")

}