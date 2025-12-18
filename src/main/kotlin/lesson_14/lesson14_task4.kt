package org.example.lesson_14

open class CelestialBodies(
    open val atmosphere: Boolean,
    open val suitableForLanding: Boolean,
    val name: String,
) {
    open fun printCelrstialBodies() {
        println("Название небесного тела: $name")
    }
}

class Planet(
    name: String,
    override val atmosphere: Boolean,
    override val suitableForLanding: Boolean,
) : CelestialBodies(
    atmosphere = atmosphere,
    suitableForLanding = suitableForLanding,
    name = name
) {
    val satelliteList: MutableList<Satellite> = mutableListOf()

    override fun printCelrstialBodies() {
        super.printCelrstialBodies()
        println("Спутники:")
        satelliteList.forEach { println(" -${it.name}") }
    }
}

class Satellite(
    name: String,
    atmosphere: Boolean,
    suitableForLanding: Boolean,
) : CelestialBodies(
    atmosphere = atmosphere,
    suitableForLanding = suitableForLanding,
    name = name,
)

fun main() {

    val firstPlanet = Planet("Зелибоба", true, true)
    val firstSatellite = Satellite("Мишка гамми", false, false)
    val secondSatellite = Satellite("Лабуба", true, false)

    firstPlanet.satelliteList.add(firstSatellite)
    firstPlanet.satelliteList.add(secondSatellite)
    firstPlanet.printCelrstialBodies()
}