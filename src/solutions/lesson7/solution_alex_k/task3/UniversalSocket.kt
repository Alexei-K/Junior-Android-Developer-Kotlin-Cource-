package solutions.lesson7.solution_alex_k.task3

import solutions.lesson6.solution_alex_k.task1.Chargable

class UniversalSocket(private var chargePercentPerMinute: Float) {
    fun charge(device: Chargable, chargePower: Float = 1f, secondDevice: Chargable? = null) {
        device.charge(chargePercentPerMinute * chargePower)
        if (secondDevice != null) {
            secondDevice.charge(chargePercentPerMinute * chargePower)
        }
    }
}