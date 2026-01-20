package org.example.lesson_17

class ShipMob (
    name: String,
    speed: Int,
    port: String
) {
    var name = name
        set(value) {
            println("You can't change ship name!")
            print("Ship name is: ")
            !field.equals(value)
        }

    var speed = speed
        get() = field
        set(value) {
            field = value
        }

    var port = port
        get() = field
        set(value) {
            field = value
        }
}

fun main() {

    val shipMob = ShipMob("BigMac", 400, "Australia")

    shipMob.name = "Mister Proper"
    println(shipMob.name)
    println()
    println("Ship speed: ${shipMob.speed}")
    shipMob.speed = 250
    println("New ship speed: ${shipMob.speed}")
    println()
    println("Ship homeport: ${shipMob.port}")
    shipMob.port = "Malaysia"
    println("New ship homeport: ${shipMob.port}")

}