package lesson6.solution.anastasiya.task1

class Tesla : Chargeable {
    override var currentCharge: Float = 0f
        set(value) {
            if (value <= 100) {
                field = value
            } else {
                field = 100f
            }
        }

    override fun charge(chargePercentPerMinute: Float) {
        val charge_PercentPerMinute: Float = chargePercentPerMinute * 0.75f
        while (currentCharge < 100f) {
            currentCharge += charge_PercentPerMinute
            println("$currentCharge ${this::class.simpleName}")
        }
    }
}