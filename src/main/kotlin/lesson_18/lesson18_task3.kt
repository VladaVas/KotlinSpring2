package org.example.lesson_18

open class Animal(
    val name: String,
    private val food: String,
) {

    fun sleep() {
        println("$name -> sleeping")
    }

    open fun eat() {
        println("$name -> eating $food")
    }
}

class Fox(name: String = "Fox", food: String = "berries") : Animal(name, food)
class Dog(name: String = "Dog", food: String = "bones") : Animal(name, food)
class Cat(name: String = "Cat", food: String = "fish") : Animal(name, food)


fun main() {
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()

    val animalList: List<Animal> = listOf(fox, dog, cat)
    for (animal in animalList) {
        animal.eat()
        println()
    }
}