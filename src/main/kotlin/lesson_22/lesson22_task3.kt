package org.example.lesson_22

data class Cat(
    val name: String,
    val age: Int,
    val color: String,
)

fun main() {

    val cat = Cat(
        "Bonya",
        4,
        "Ginger"
    )

    val (name, age, color) = cat

    println(name)
    println(age)
    println(color)
}