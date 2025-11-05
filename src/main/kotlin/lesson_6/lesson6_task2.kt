package org.example.lesson_6

fun main() {

    println("Введите количество секунд: ")
    val seconds = readln().toInt()

    println("Таймер запущен на $seconds секунд: ")
    Thread.sleep(seconds * 1000L)

    println("Прошло $seconds секунд.")

}