package solutions.lesson6.solution_alex_k.task1

interface Chargable {
    fun charge(chargePercentPerMinute: Float)
    var currentCharge: Float
}