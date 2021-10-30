package lesson6.solution.alex.k.task1

interface Chargable {
    fun charge(chargePercentPerMinute: Float)
    var currentCharge: Float
}