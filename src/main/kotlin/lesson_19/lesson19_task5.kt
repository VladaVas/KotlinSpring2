package org.example.lesson_19

enum class Gender {
    FEMALE,
    MALE,
}

class Person(
    val name: String,
    private val gender: Gender
) {
    override fun toString(): String {
        return "$name ($gender)"
    }
}

fun main() {
    println("Enter person name and gender through a space (Available values: MALE, FEMALE).")
    val directory = mutableListOf<Person>()

    repeat(5) {
        println("Enter name:")
        val name = readln()

        println("Enter gender:")
        val gender = Gender.valueOf(readln().uppercase())

        directory.add(Person(name, gender))
    }

    directory.forEach { println(it) }
}