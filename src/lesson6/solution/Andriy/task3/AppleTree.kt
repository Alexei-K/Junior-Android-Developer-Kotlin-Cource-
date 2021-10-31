package lesson6.solution.Andriy.task3

class AppleTree(name: String) : Tree(name) {
    override val maxAge: Int = (0..80).random()

    override val isAlive: Boolean
        get() = currentAge < maxAge

    override fun grow(years: Int) {
        if (!isAlive) return
        if (currentAge < 3) {
            currentHeight += years * 2
        } else {
            currentHeight += years * 0.5
        }
        currentAge += years
    }
}