package org.example.lesson_20

fun main() {

    println("Введите имя:")
    val username = readln()
    val printGreeting: (String) -> String = { name ->
        "С наступающим Новым Годом, $name!"
    }
    println(printGreeting(username))
}