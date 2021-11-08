package lesson6.solution.anastasiya.task1

class IPhone : Chargeable {
    override var currentCharge: Float = 0f
    override fun charge(chargePercentPerMinute: Float) {
        while (currentCharge < 80) {
            currentCharge += chargePercentPerMinute
            if (currentCharge > 80) {
                currentCharge = 80f
            }
            println("$currentCharge ${this::class.simpleName}")
        }
        val _chargePercentPerMinute = chargePercentPerMinute / 2
        while (currentCharge < 100f) {
            currentCharge += _chargePercentPerMinute
            if (currentCharge > 100) {
                currentCharge = 100f
            }
            println("$currentCharge ${this::class.simpleName}")
        }
    }
}
