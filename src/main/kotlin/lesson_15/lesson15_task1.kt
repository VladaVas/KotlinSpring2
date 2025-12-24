package org.example.lesson_15

interface Swimmable {
    fun swim() {
        println("Это существо умеет плавать")
    }
}

interface Flyable {
    fun fly() {
        println("Это существо умеет летать")
    }
}

class Carp : Swimmable

class Seagull : Flyable

class Duck : Swimmable, Flyable{
    fun duckMoveble() {
        swim()
        fly()
    }
}

fun main() {

    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    println("Карп, возможности:")
    carp.swim()
    println()

    println("Чайка, возможности:")
    seagull.fly()
    println()

    println("Утка, возможности:")
    duck.duckMoveble()

}