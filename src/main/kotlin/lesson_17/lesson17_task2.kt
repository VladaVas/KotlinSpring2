package org.example.lesson_17

class ShipMob(
    name: String,
    speed: Int,
    port: String
) {
    var name = name
        set(value) {
            println("You can't change ship name!\nShip name is: $name")
        }

    var speed = speed

    var port = port
}

fun main() {

    val shipMob = ShipMob("BigMac", 400, "Australia")

    shipMob.name = "Mister Proper"
    println()
    println("Ship speed: ${shipMob.speed}")
    shipMob.speed = 250
    println("New ship speed: ${shipMob.speed}")
    println()
    println("Ship homeport: ${shipMob.port}")
    shipMob.port = "Malaysia"
    println("New ship homeport: ${shipMob.port}")

}