package solutions.lesson6.solution_ihor

import solutions.lesson6.solution_ihor.task1.ElectroSocket
import solutions.lesson6.solution_ihor.task1.IPhone
import solutions.lesson6.solution_ihor.task1.Tesla
import solutions.lesson6.solution_ihor.task2.decodeWebError
import solutions.lesson6.solution_ihor.task3.*
import kotlin.random.Random

fun main() {
    decodeWebError(23)
    decodeWebError(202)
    decodeWebError(404)
    decodeWebError(407)
    decodeWebError(564)

    val phone = IPhone()
    phone.currentCharge = -1f
    phone.charge(1f)

    val car = Tesla()
    car.currentCharge = 1f
    car.charge(5f)

    val phone1 = IPhone()
    phone1.currentCharge = 30f
    val socket = ElectroSocket(2f)
    socket.chargeDevice(phone1)

    val forest1 = Forest(
        "Canadian Forest", arrayOf(
            Oak(), AppleTree(), Walnut(), Oak(), AppleTree(), Walnut()
        )
    )

    val forest2 = Forest(
        "American Forest", arrayOf(
            AppleTree(), Oak(), AppleTree(), Walnut(), Oak(), Oak()
        )
    )

    while (forest1.isAlive || forest2.isAlive) {
        val randomYear: Int = Random.nextInt(10, 20)
        forest1.someYearsPassed(randomYear)
        forest2.someYearsPassed(randomYear)
    }


    val aliveForest = AliveForest(if (forest1.isAlive) forest1 else forest2)
    aliveForest.print()


}