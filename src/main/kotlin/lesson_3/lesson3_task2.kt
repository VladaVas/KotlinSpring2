package org.example.lesson_3

fun main() {
    var firstName = "Татьяна"
    val lastName = "Андреева"
    val middleName = "Сергеевна"
    var age = 20

    println("ФИО: $lastName $firstName $middleName, возраст: $age")

    lastName = "Сидорова"
    age = 22

    println("ФИО: $lastName $firstName $middleName, возраст: $age")

}