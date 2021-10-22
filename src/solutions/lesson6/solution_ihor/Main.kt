package solutions.lesson6.solution_ihor

import solutions.lesson6.solution_ihor.task1.ElectroSocket
import solutions.lesson6.solution_ihor.task1.IPhone
import solutions.lesson6.solution_ihor.task1.Tesla
import solutions.lesson6.solution_ihor.task2.decodeWebError

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
    car.currentCharge=1f
    car.charge(5f)

    val phone1 = IPhone()
    phone1.currentCharge=30f
    val socket = ElectroSocket(2f)
    socket.chargeDevice(phone1)



}