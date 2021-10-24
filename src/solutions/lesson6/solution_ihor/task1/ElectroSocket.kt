package solutions.lesson6.solution_ihor.task1

class ElectroSocket( private var chargePercentPerMinute: Float) {
    fun chargeDevice(device: Chargeable) {
        device.charge(chargePercentPerMinute)
    }


}