package solutions.lesson7.solution_Ihor.task2

import solutions.lesson6.solution_ihor.task1.Chargeable
import solutions.lesson6.solution_ihor.task1.ElectroSocket

class ModernSocket(private var chargePercentPerMinute: Float) : ElectroSocket(chargePercentPerMinute) {
    fun chargeDevice(device: Chargeable, chargePower: Float) {
        device.charge(chargePercentPerMinute * chargePower)

    }

    fun chargeDevice(device1: Chargeable, device2: Chargeable) {
        device1.charge(chargePercentPerMinute)
        device2.charge(chargePercentPerMinute)
    }


}