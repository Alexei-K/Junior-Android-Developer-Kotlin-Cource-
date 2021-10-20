package solutions.lesson6.solution_alex_k.task1

import solutions.lesson6.solution_alex_k.task1.Chargable

class ElectroSocket(private var chargePercentPerMinute: Float) {

    fun charge(device: Chargable) {
        device.charge(chargePercentPerMinute)
    }
}