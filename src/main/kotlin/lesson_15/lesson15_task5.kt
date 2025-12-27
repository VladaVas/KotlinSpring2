package org.example.lesson_15

interface MovementActions {
    fun vehicleMoving()
    fun vehicleStanding()
}

interface ActionsWithPassanger {
    val currentPassengersAmount: Int
    val maxPassengersAmount: Int
    fun passengerLoading(count: Int)
    fun passengerUnloading(count: Int)
}

interface ActionsWithCargo {
    val currentPassengersAmount: Int
    val maxPassengersAmount: Int
    val currentCargoAmout: Double
    val maxCargoAmout: Double
    fun cargoLoading(count: Double)
    fun cargoUnloading(count: Double)
}

class Car(
    val name: String,
    override val maxPassengersAmount: Int = 3,
) : MovementActions, ActionsWithPassanger {
    override var currentPassengersAmount = 0

    override fun passengerLoading(count: Int) {
        val freeSeats = maxPassengersAmount - currentPassengersAmount
        val toLoad = minOf(count, freeSeats)
        if (toLoad > 0) {
            currentPassengersAmount+= toLoad
            println("$name: загружено пассажиров $toLoad ($currentPassengersAmount/$maxPassengersAmount)")
        } else {
            println("$name переполнен, добавлять новых пассажиров нельзя.")
        }
    }

    override fun passengerUnloading(count: Int) {
        val toUnload = minOf(count, currentPassengersAmount)
        if (toUnload> 0) {
            currentPassengersAmount-= toUnload
            println("$name: выгружено пассажиров $toUnload ($currentPassengersAmount/$maxPassengersAmount)")
        } else {
            println("$name: Нет пассажиров для выгрузки.")
        }
    }

    override fun vehicleMoving() {
        println("$name едет")
    }

    override fun vehicleStanding() {
        println("$name остановился")
    }
}


class Truck(
    val name: String,
    override val maxPassengersAmount: Int = 1,
    override val maxCargoAmout: Double = 2.0,
) : MovementActions, ActionsWithPassanger, ActionsWithCargo {
    override var currentPassengersAmount = 0
    override var currentCargoAmout = 0.0

    override fun passengerLoading(count: Int) {
        val freeSeats = maxPassengersAmount - currentPassengersAmount
        val toLoad = minOf(count, freeSeats)
        if (toLoad > 0) {
            currentPassengersAmount+= toLoad
            println("$name: загружено пассажиров $toLoad ($currentPassengersAmount/$maxPassengersAmount)")
        } else {
            println("$name переполнен, добавлять новых пассажиров нельзя.")
        }
    }

    override fun passengerUnloading(count: Int) {
        val toUnload = minOf(count, currentPassengersAmount)
        if (toUnload> 0) {
            currentPassengersAmount-= toUnload
            println("$name: выгружено пассажиров $toUnload ($currentPassengersAmount/$maxPassengersAmount)")
        } else {
            println("$name: Нет пассажиров для выгрузки.")
        }
    }

    override fun cargoLoading(count: Double) {
        val freeSpace = maxCargoAmout - currentCargoAmout
        val toLoad = minOf(count, freeSpace)

        if (toLoad > 0) {
            currentCargoAmout+= toLoad
            println("$name: загружено груза $toLoad т ($currentCargoAmout/$maxCargoAmout т)")
        } else {
            println("$name переполнен, добавлять груз больше нельзя.")
        }
    }

    override fun cargoUnloading(count: Double) {
        val toUnload = minOf(count, currentCargoAmout)
        if (toUnload > 0) {
            currentCargoAmout-= toUnload
            println("$name: выгружено груза $toUnload т ($currentCargoAmout/$maxCargoAmout тонн)")
        } else {
            println("$name: Нет груза для выгрузки.")
        }
    }

    override fun vehicleMoving() {
        println("$name едет")
    }

    override fun vehicleStanding() {
        println("$name остановился")
    }
}

fun main() {

    val car = Car("Молния Маккуин", 3)
    val truck = Truck("Гэрри", 1, 2.0)

    car.passengerLoading(3)
    car.vehicleMoving()
    car.vehicleStanding()
    car.passengerUnloading(1)
    car.passengerLoading(1)
    car.vehicleMoving()
    car.vehicleStanding()
    car.passengerUnloading(3)
    println()
    truck.passengerLoading(1)
    truck.cargoLoading(1.0)
    truck.vehicleMoving()
    truck.vehicleStanding()
    truck.passengerUnloading(1)
    truck.cargoLoading(1.0)
    truck.passengerLoading(1)
    truck.vehicleMoving()
    truck.vehicleStanding()
    truck.passengerUnloading(1)
    truck.cargoUnloading(2.0)
}


