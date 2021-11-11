package lesson6.solution.anastasiya.task1

open class ElectroSocket(var chargePercentPerMinute: Float) {
    fun chargeDevice (devise: Chargeable) {
        devise.charge(chargePercentPerMinute)
    }
}