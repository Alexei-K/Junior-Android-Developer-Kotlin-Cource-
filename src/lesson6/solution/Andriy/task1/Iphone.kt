package lesson6.solution.Andriy.task1


class IPhone : Chargable {
    override fun charge(chargePercentPerMinute: Float) {
        while (currentCharge < 80) {
            currentCharge += chargePercentPerMinute
            println("IPhone is charged up to $currentCharge")
        }
        println("IPhone is charged up to $currentCharge. Slow charging.")

        while (currentCharge < 100) {
            println("IPhone is charged up to $currentCharge")
            currentCharge += (chargePercentPerMinute * 0.5).toFloat()
        }
        println("IPhone is full charged")


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