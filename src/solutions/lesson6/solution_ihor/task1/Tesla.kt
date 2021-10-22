package solutions.lesson6.solution_ihor.task1

class Tesla() : Chargeable {
    override fun charge(chargePercentPerMinute: Float) {
        while (currentCharge < 100) {
            currentCharge +=(chargePercentPerMinute * 0.75f)
            println(" Current percent of battery is^ $currentCharge")
        }
        println("Tesla is ready to ride")
    }

    override var currentCharge: Float = 0.0f
        set(value) {
            when {
                (value < 0f) -> field = 0f
                (value > 100f) -> field = 100f
                else -> field = value

            }
        }
}