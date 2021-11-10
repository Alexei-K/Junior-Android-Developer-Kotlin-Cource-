package lesson7.solution.anastasiya.task2

import lesson6.solution.anastasiya.task1.Chargeable
import lesson6.solution.anastasiya.task1.ElectroSocket

class ModernSocket(var chargePerMinute: Float): ElectroSocket(chargePerMinute) {
    fun chargeDevise (device: Chargeable, chargePower: Float) {
        device.charge(chargePerMinute*chargePower)
    }
    fun chargeDevise (device1: Chargeable, device2: Chargeable) {
        device1.charge(chargePerMinute)
        device2.charge(chargePerMinute)
    }
}