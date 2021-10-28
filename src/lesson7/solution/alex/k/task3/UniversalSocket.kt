package lesson7.solution.alex.k.task3

import lesson6.solution.alex.k.task1.Chargable

class UniversalSocket(private var chargePercentPerMinute: Float) {
    fun charge(device: Chargable, chargePower: Float = 1f, secondDevice: Chargable? = null) {
        device.charge(chargePercentPerMinute * chargePower)
        if (secondDevice != null) {
            secondDevice.charge(chargePercentPerMinute * chargePower)
        }
    }
}