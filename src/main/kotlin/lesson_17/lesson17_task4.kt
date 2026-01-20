package org.example.lesson_17

class Parsel(
    val number: Int,
    location: String,
    var moveCount: Int = 0,
) {

    var location = location
        set(value) {
            field = value
            moveCount += 1
        }
}

fun main() {

    val parsel = Parsel(2115, "Moscow")

    println("Parsel information: \n number: ${parsel.number} \n location: ${parsel.location} \n number of movement: ${parsel.moveCount}")
    parsel.location = "Moscow Sort Center"
    println()
    println("Parsel information: \n number: ${parsel.number} \n location: ${parsel.location} \n number of movement: ${parsel.moveCount}")
    println()
    parsel.location = "Saint-Petersburg"
    println("Parsel information: \n number: ${parsel.number} \n location: ${parsel.location} \n number of movement: ${parsel.moveCount}")
    println()
    parsel.location = "Saint-Petersburg Sort Center"
    println("Parsel information: \n number: ${parsel.number} \n location: ${parsel.location} \n number of movement: ${parsel.moveCount}")
    println()
    parsel.location = "Pick-up point"
    println("Parsel information: \n number: ${parsel.number} \n location: ${parsel.location} \n number of movement: ${parsel.moveCount}")
}