package org.example.lesson_15

interface MovementActions {
    fun vehicleMoving()
    fun vehicleStanding()
}

interface ActionsWithPassanger {
    fun passengerLoading()
    fun passengerUnloading()
}

interface ActionsWithCargo {
    fun cargoLoading()
    fun cargoUnloading()
}

abstract class Vehicles(
    val name: String,
    open val maxPassengersAmount: Int,
    open val maxCargoAmout: Double,
)

class Cars(
    name: String,
    maxPassengersAmount: Int = 3,
) : Vehicles(
    name = name,
    maxPassengersAmount = maxPassengersAmount,
    maxCargoAmout = 0.0,
), MovementActions, ActionsWithPassanger {
    private var currentPassengersAmount = 0

    override fun passengerLoading() {
        if (currentPassengersAmount < maxPassengersAmount) {
            currentPassengersAmount++
            println("$name: пассажир загружен ($currentPassengersAmount/$maxPassengersAmount)")
        } else {
            println("$name переполнен, добавлять новых пассажиров нельзя.")
        }
    }

    override fun passengerUnloading() {
        if (currentPassengersAmount > 0) {
            currentPassengersAmount--
            println("$name: пассажир выгружен ($currentPassengersAmount/$maxPassengersAmount)")
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


class Trucks(
    name: String,
    maxPassengersAmount: Int = 1,
    maxCargoAmout: Double = 2.0,
) : Vehicles(
    name = name,
    maxPassengersAmount = maxPassengersAmount,
    maxCargoAmout = maxCargoAmout,
), MovementActions, ActionsWithPassanger, ActionsWithCargo {
    private var currentPassengerAmount = 0
    private var currentCargoAmout = 0.0

    override fun passengerLoading() {
        if (currentPassengerAmount < maxPassengersAmount) {
            currentPassengerAmount++
            println("$name: пассажир загружен ($currentPassengerAmount/$maxPassengersAmount)")
        } else {
            println("$name переполнен, добавлять новых пассажиров нельзя.")
        }
    }

    override fun passengerUnloading() {
        if (currentPassengerAmount > 0) {
            currentPassengerAmount--
            println("$name: пассажир выгружен ($currentPassengerAmount/$maxPassengersAmount)")
        } else {
            println("$name: Нет пассажиров для выгрузки.")
        }
    }

    override fun cargoLoading() {
        if (currentCargoAmout < maxCargoAmout) {
            currentCargoAmout++
            println("$name: груз загружен ($currentCargoAmout/$maxCargoAmout тонн)")
        } else {
            println("$name переполнен, добавлять груз больше нельзя.")
        }
    }

    override fun cargoUnloading() {
        if (currentCargoAmout > 0) {
            currentCargoAmout--
            println("$name: груз выгружен ($currentCargoAmout/$maxCargoAmout тонн)")
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

    val car = Cars("Молния Маккуин", 3)

    val truck = Trucks("Гэрри", 2, 2.0)

    car.passengerLoading()
    car.passengerLoading()
    car.passengerLoading()
    car.passengerLoading()
    car.vehicleMoving()
    car.vehicleStanding()
    car.passengerUnloading()
    car.passengerLoading()
    car.vehicleMoving()
    car.vehicleStanding()
    car.passengerUnloading()
    car.passengerUnloading()
    car.passengerUnloading()

    truck.passengerLoading()
    truck.vehicleMoving()
    truck.vehicleStanding()
    truck.cargoLoading()
    truck.vehicleMoving()
    truck.vehicleStanding()
    truck.passengerUnloading()
    truck.passengerLoading()
    truck.cargoLoading()
    truck.cargoLoading()
    truck.vehicleMoving()
    truck.vehicleStanding()
    truck.passengerUnloading()
    truck.cargoUnloading()
    truck.cargoUnloading()
}


