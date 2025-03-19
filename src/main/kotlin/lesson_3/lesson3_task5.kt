package org.example.lesson_3

fun main() {

    // Не знаю, как нужно было решить задание, если в уроке не было такой информации, но чат гпт говорит, что решается так
    val moveString = "D2-D4;0"

    val parts = moveString.split("-", ";")

    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}