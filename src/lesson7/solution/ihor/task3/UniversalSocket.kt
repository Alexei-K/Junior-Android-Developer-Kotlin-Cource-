package lesson7.solution.ihor.task3

import lesson6.solution.ihor.task1.Chargeable

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