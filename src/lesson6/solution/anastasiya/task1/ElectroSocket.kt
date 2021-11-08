package lesson6.solution.anastasiya.task1

class ElectroSocket(var chargePercentPerMinute: Float) {
    fun chargeDevice (class1: Chargeable) {
        class1.charge(chargePercentPerMinute)
    }
}