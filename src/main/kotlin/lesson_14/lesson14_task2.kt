package org.example.lesson_14

abstract class BaseVessel(
    val name: String,
    open val speed: Int = 250,
    open val capacity: Int = 400,
    open val liftingCapacity: Int = 300,
    open val icebreakingAbility: Boolean = false,
) {
    abstract fun loadCargo()
    open fun printInfo() {
        println(
            """
        Корабль: $name,
        Скорость: $speed км/ч,
        Вместисомть: $capacity, 
        Грузоподъемность: $liftingCapacity,
        Может колоть лёд: $icebreakingAbility
    """.trimIndent()
        )
    }
}

class PassengerLiner(
    name: String,
    speed: Int = 250,
    capacity: Int = 500,
    liftingCapacity: Int = 200,
) : BaseVessel(
    name = name,
    speed = speed,
    capacity = capacity,
    liftingCapacity = liftingCapacity,
) {
    override fun loadCargo() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShipVessel(
    name: String,
    speed: Int = 150,
    capacity: Int = 300,
    liftingCapacity: Int = 400,
) : BaseVessel(
    name = name,
    speed = speed,
    capacity = capacity,
    liftingCapacity = liftingCapacity,
) {
    override fun loadCargo() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class IcebreakerVessel(
    name: String,
    speed: Int = 200,
    capacity: Int = 250,
    liftingCapacity: Int = 300,
    icebreakingAbility: Boolean = true,
) : BaseVessel(
    name = name,
    speed = speed,
    capacity = capacity,
    liftingCapacity = liftingCapacity,
    icebreakingAbility = icebreakingAbility,
) {
    override fun loadCargo() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {

    val liner = PassengerLiner("Лайнер \"Анатолий\"")
    val cargoship = CargoShipVessel("Грузовое судно \"Слон Вася\"")
    val icebreaker = IcebreakerVessel("Ледокол \"Мишка на севере\"")

    liner.printInfo()
    liner.loadCargo()
    println()

    cargoship.printInfo()
    cargoship.loadCargo()
    println()

    icebreaker.printInfo()
    icebreaker.loadCargo()
}