package org.example.lesson_15

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

class Carp : Swimmable {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull : Flyable {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck : Swimmable, Flyable {
    override fun swim() {
        println("Утка плавает")
    }

    override fun fly() {
        println("Утка летает")
    }
}

fun main() {

    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()
    println()

    seagull.fly()
    println()

    duck.swim()
    duck.fly()
}