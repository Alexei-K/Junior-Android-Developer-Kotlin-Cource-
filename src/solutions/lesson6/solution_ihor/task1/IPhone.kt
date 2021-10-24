package solutions.lesson6.solution_ihor.task1

class IPhone() : Chargeable {
    override fun charge(chargePercentPerMinute: Float) {
        while (currentCharge < 80) {
            currentCharge +=chargePercentPerMinute
            println("Current charge is: $currentCharge")
        }

        while (currentCharge < 100 && currentCharge >= 80) {
            currentCharge +=(chargePercentPerMinute * 0.5f)
            println("IPhone is charging slowly current percent is $currentCharge")
        }

        println("IPhone is charged")


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