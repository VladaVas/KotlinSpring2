package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGLEFISH,
    GOLDFISH,
    SIAMESEFIGTINGFISH,
}

fun main() {

    println("You can add the following fish to your aquarium:")

    Fish.entries.forEach {
        println(it)
    }
}