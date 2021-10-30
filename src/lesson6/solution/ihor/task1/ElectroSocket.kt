package lesson6.solution.ihor.task1

open class ElectroSocket(private var chargePercentPerMinute: Float) {
    fun chargeDevice(device: Chargeable) {
        device.charge(chargePercentPerMinute)
    }


}