package org.example.lesson_21

fun main() {

    val string1 = "Hello"
    val string2 = "Булочка"
    println(string1.vowelCount())
    println(string2.vowelCount())
}

fun String.vowelCount(): Int {
    return this.lowercase().count { it in "aeiouаеёиоуыэюя" }
}