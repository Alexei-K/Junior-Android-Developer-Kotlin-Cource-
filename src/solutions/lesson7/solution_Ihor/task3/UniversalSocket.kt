package solutions.lesson7.solution_Ihor.task3

import solutions.lesson6.solution_ihor.task1.Chargeable

class UniversalSocket(private var chargePercentPerMinute: Float) {
    fun charge(device: Chargeable, chargePower: Float = 1f, device2: Chargeable = device) {
        if (device == device2) {
            device.charge(chargePercentPerMinute * chargePower)
        } else {
            device.charge(chargePercentPerMinute * chargePower)
            device2.charge(chargePercentPerMinute * chargePower)
        }

    }

}