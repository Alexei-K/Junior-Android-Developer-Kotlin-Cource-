package lesson6.solution.anastasiya.task3

class Oak(override var name: String) : Tree() {

    override var height = 0.0
    override var maxYears = 200
    override var currentAge = 0

    init {
        val age = (1..maxYears).random()
        grow(age)
    }

    override fun grow(pastYears: Int) {
        if (isAlive()) {
            if (currentAge < 100) {

                height += (pastYears * 2)
            }
            currentAge += pastYears
        }
    }
}