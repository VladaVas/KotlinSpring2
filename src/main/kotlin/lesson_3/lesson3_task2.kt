package org.example.lesson_3

fun main() {
    val firstName = "Татьяна"

    var lastName: String
    lastName = "Андреева"

    val middleName = "Сергеевна"

    var age: Int
    age = 20

    println("ФИО: $lastName $firstName $middleName, возраст: $age")

    lastName = "Сидорова"
    age = 22

    println("ФИО: $lastName $firstName $middleName, возраст: $age")

}