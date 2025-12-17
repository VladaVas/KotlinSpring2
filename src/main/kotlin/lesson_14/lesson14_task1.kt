package org.example.lesson_14

open class Vessel(
    val name: String,
    open val speed: Int = 250,
    open val capacity: Int = 400,
    open val liftingCapacity: Int = 300,
   open val icebreakingAbility: Boolean = false,
) {}

class Liner(
    name: String,
    speed: Int = 250,
    capacity: Int = 500,
    liftingCapacity: Int = 200,
) : Vessel(
    name = name,
    speed = speed,
    capacity = capacity,
    liftingCapacity = liftingCapacity,
)
class Cargoship(
    name: String,
    speed: Int = 150,
    capacity: Int = 300,
    liftingCapacity: Int = 400,
): Vessel(
    name = name,
    speed = speed,
    capacity = capacity,
    liftingCapacity = liftingCapacity,
) {}

class Icebreaker(
    name: String,
    speed: Int = 200,
    capacity: Int = 250,
    liftingCapacity: Int = 300,
    icebreakingAbility: Boolean = true,
): Vessel(
    name = name,
    speed = speed,
    capacity = capacity,
    liftingCapacity = liftingCapacity,
    icebreakingAbility = icebreakingAbility,
) {}

fun main() {

    val liner = Liner("Лайнер \"Анатолий\"",)
    val cargoship = Cargoship("Грузовое судно \"Слон Вася\"")
    val icebreaker = Icebreaker("Ледокол \"Мишка на севере\"")

    println("Имя: ${liner.name}, Скорость: ${liner.speed} км/ч")
    println("Имя: ${cargoship.name}, Скорость: ${cargoship.speed} км/ч")
    println("Имя: ${icebreaker.name}, Скорость: ${icebreaker.speed} км/ч")
}