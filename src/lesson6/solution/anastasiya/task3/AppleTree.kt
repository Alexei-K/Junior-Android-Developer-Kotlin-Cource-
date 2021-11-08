package lesson6.solution.anastasiya.task3

class AppleTree(override var name: String) : Tree() {
    override var height = 0.0
    override var maxYears = 80
    override var currentAge = 0

    init {
        val age = (1..maxYears).random()
        grow(age)
    }

    override fun grow(pastYears: Int) {
        if (isAlive()) {
            if (currentAge <= 3) {
                height += (pastYears * 2)
            } else if (currentAge > 3) {
                height += (pastYears * 0.5)
            }
            currentAge += pastYears
        }
    }
}