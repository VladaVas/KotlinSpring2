package org.example.lesson_19

enum class Bullet(val impact: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    private var currentBullet: Bullet? = null
) {

    fun weaponBullet(bullet: Bullet) {
        currentBullet = bullet
        println("${bullet.name} bullets selected")
    }

    fun shoot() {
        if (currentBullet == null) {
            println("Tank is not loaded!")
        } else {
            println("Damage - ${currentBullet!!.impact}")
            currentBullet = null
        }
    }
}

fun main() {
     val tank = Tank()

    tank.weaponBullet(Bullet.BLUE)
    tank.shoot()
    tank.weaponBullet(Bullet.RED)
    tank.shoot()
    tank.weaponBullet(Bullet.GREEN)
    tank.shoot()
    tank.shoot()
}
