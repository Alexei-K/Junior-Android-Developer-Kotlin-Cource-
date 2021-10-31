package lesson6.solution.Andriy.task1

interface Chargable {
    fun charge(chargePercentPerMinute: Float)
    var currentCharge: Float
}