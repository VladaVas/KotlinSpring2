package org.example.lesson_22


data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distance: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Closest star system to the solar system",
        dateTime = "2026-02-07 22:30",
        distance = 5.73
    )

    println("The name of a place or event: ${alphaCentauri.component1()}")
    println("A description of the place or event: ${alphaCentauri.component2()}")
    println("Date and time of the event: ${alphaCentauri.component3()}")
    println("The distance of a place or event from Earth in light years: ${alphaCentauri.component4()}")
}