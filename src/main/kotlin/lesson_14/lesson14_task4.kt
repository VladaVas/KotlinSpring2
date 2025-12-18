package org.example.lesson_14

open class CelestialBody(
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
    val satelliteList: List<Satellite> = listOf(),
) : CelestialBody(
    atmosphere = atmosphere,
    suitableForLanding = suitableForLanding,
    name = name
) {
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
) : CelestialBody(
    atmosphere = atmosphere,
    suitableForLanding = suitableForLanding,
    name = name,
)

fun main() {

    val firstSatellite = Satellite("Мишка гамми", false, false)
    val secondSatellite = Satellite("Лабуба", true, false)
    val firstPlanet = Planet(
        "Зелибоба",
        true,
        true,
        satelliteList = listOf(firstSatellite, secondSatellite)
    )

    firstPlanet.printCelrstialBodies()
}