package lesson7.solution.anastasiya.task3

import lesson6.solution.anastasiya.task1.Chargeable
import lesson6.solution.anastasiya.task1.ElectroSocket
import lesson6.solution.anastasiya.task1.Tesla

class UniversalSocket(var chargePerMinute_: Float) {
    val defoltTesla = Tesla()
    fun charge(devise: Chargeable, chargePower: Float = 1f, secondDevice: Chargeable = defoltTesla) {
        devise.charge(chargePerMinute_ * chargePower)
        if (secondDevice != defoltTesla) {
            secondDevice.charge(chargePerMinute_ * chargePower)
        }
    }
}