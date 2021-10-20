package solutions.lesson6.solution_alex_k.task1

import solutions.lesson6.solution_alex_k.task1.Chargable

class Tesla : Chargable {
    override fun charge(chargePercentPerMinute: Float) {
        while (currentCharge < 100) {
            currentCharge += (chargePercentPerMinute * 0.75).toFloat()
            println("Tesla is charged up to $currentCharge")
        }
        println("Tesla is fully charged")

    }

    override var currentCharge: Float = 0.0f
        set(value) {
            when {
                value < 0f -> {
                    field = 0f
                }
                value > 100f -> {
                    field = 100f
                }
                else -> {
                    field = value
                }
            }
        }
}