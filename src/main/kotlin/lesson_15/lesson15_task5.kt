package org.example.lesson_15

interface MovementActions {
    val name: String
    fun vehicleMoving() {
        println("$name едет")
    }

    fun vehicleStanding() {
        println("$name остановился")
    }
}

interface ActionsWithPassenger {
    val name: String
    val currentPassengersAmount: Int
    val maxPassengersAmount: Int

    fun changePassengers(delta: Int)

    fun passengerLoading(count: Int) {
        val freeSeats = maxPassengersAmount - currentPassengersAmount
        val toLoad = minOf(count, freeSeats)

        if (toLoad > 0) {
            changePassengers(toLoad)
            println("$name: загружено пассажиров $toLoad ($currentPassengersAmount/$maxPassengersAmount)")
        } else {
            println("$name переполнен, добавлять новых пассажиров нельзя.")
        }
    }

    fun passengerUnloading(count: Int) {
        val toUnload = minOf(count, currentPassengersAmount)

        if (toUnload > 0) {
            changePassengers(-toUnload)
            println("$name: выгружено пассажиров $toUnload ($currentPassengersAmount/$maxPassengersAmount)")
        } else {
            println("$name: Нет пассажиров для выгрузки.")
        }
    }
}

interface ActionsWithCargo {
    val name: String
    val currentCargoAmount: Double
    val maxCargoAmount: Double

    fun changeCargo(delta: Double)

    fun cargoLoading(count: Double) {
        val freeSpace = maxCargoAmount - currentCargoAmount
        val toLoad = minOf(count, freeSpace)

        if (toLoad > 0) {
            changeCargo(toLoad)
            println("$name: загружено груза $toLoad т ($currentCargoAmount/$maxCargoAmount т)")
        } else {
            println("$name переполнен, добавлять груз больше нельзя.")
        }
    }

    fun cargoUnloading(count: Double) {
        val toUnload = minOf(count, currentCargoAmount)
        if (toUnload > 0) {
            changeCargo(-toUnload)
            println("$name: выгружено груза $toUnload т ($currentCargoAmount/$maxCargoAmount тонн)")
        } else {
            println("$name: Нет груза для выгрузки.")
        }
    }
}

class Car(
    override val name: String,
    override val maxPassengersAmount: Int = 3,
) : MovementActions, ActionsWithPassenger {
    override var currentPassengersAmount = 0
        private set

    override fun changePassengers(delta: Int) {
        currentPassengersAmount += delta
    }
}

class Truck(
    override val name: String,
    override val maxPassengersAmount: Int = 1,
    override val maxCargoAmount: Double = 2.0,
) : MovementActions, ActionsWithPassenger, ActionsWithCargo {
    override var currentPassengersAmount = 0
        private set

    override var currentCargoAmount = 0.0
        private set

    override fun changePassengers(delta: Int) {
        currentPassengersAmount += delta
    }

    override fun changeCargo(delta: Double) {
        currentCargoAmount += delta
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



