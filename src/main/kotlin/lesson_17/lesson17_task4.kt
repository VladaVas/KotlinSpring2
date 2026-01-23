package org.example.lesson_17

class Package(
    val number: Int,
    location: String,
) {
    var moveCount: Int = 0
    var location = location
        set(value) {
            field = value
            moveCount++
        }
}

fun main() {

    val packege = Package(2115, "Moscow")

    println("Parsel information: \n number: ${packege.number} \n location: ${packege.location} \n number of movement: ${packege.moveCount}")
    packege.location = "Moscow Sort Center"
    println()
    println("Parsel information: \n number: ${packege.number} \n location: ${packege.location} \n number of movement: ${packege.moveCount}")
    println()
    packege.location = "Saint-Petersburg"
    println("Parsel information: \n number: ${packege.number} \n location: ${packege.location} \n number of movement: ${packege.moveCount}")
    println()
    packege.location = "Saint-Petersburg Sort Center"
    println("Parsel information: \n number: ${packege.number} \n location: ${packege.location} \n number of movement: ${packege.moveCount}")
    println()
    packege.location = "Pick-up point"
    println("Parsel information: \n number: ${packege.number} \n location: ${packege.location} \n number of movement: ${packege.moveCount}")
}