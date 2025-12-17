package org.example.lesson_14

abstract class Liner(
    open val name: String,
    open val speed: Int = 250,
    open val capacity: Int = 400,
    open val liftingCapacity: Int = 300,
    open val icebreakingAbility: Boolean = false,
)

class Cargoship(
    override val name: String,
) : Liner(
    name = name,
    speed = 250,
    capacity = 500,
    liftingCapacity = 200
)

class Icebreaker(
    override val name: String,
) : Liner(
    name = name,
    speed = 200,
    capacity = 250,
    liftingCapacity = 300,
    icebreakingAbility = true,
    )

fun main() {

    val cargoship = Cargoship("Грузовое судно \"Слон Вася\"")
    val icebreaker = Icebreaker("Ледокол \"Мишка на севере\"")

    println("Имя: ${cargoship.name}, Скорость: ${cargoship.speed} км/ч")
    println("Имя: ${icebreaker.name}, Скорость: ${icebreaker.speed} км/ч")
}