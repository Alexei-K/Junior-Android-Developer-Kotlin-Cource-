package lesson6.solution.alex.k.task1

open class ElectroSocket(private var chargePercentPerMinute: Float) {

    fun charge(device: Chargable) {
        device.charge(chargePercentPerMinute)
    }
}