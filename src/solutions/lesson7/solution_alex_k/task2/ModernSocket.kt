package solutions.lesson7.solution_alex_k.task2

import solutions.lesson6.solution_alex_k.task1.Chargable
import solutions.lesson6.solution_alex_k.task1.ElectroSocket

class ModernSocket(private var chargePercentPerMinute: Float) : ElectroSocket(chargePercentPerMinute) {

    /**
     * chargePower = 1f is 100%
     */
    fun charge(device: Chargable, chargePower: Float) {
        device.charge(chargePercentPerMinute * chargePower)
    }

    fun charge(firstDevice: Chargable, secondDevice: Chargable) {
        firstDevice.charge(chargePercentPerMinute)
        secondDevice.charge(chargePercentPerMinute)
    }
}