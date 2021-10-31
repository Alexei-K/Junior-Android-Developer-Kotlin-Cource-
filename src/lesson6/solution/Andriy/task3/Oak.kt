package lesson6.solution.Andriy.task3

class Oak(name: String) : Tree(name) {

    override val maxAge: Int = (0..200).random()


    override val isAlive: Boolean
        get() = currentAge < maxAge

    override fun grow(years: Int) {
        if (!isAlive) return
        if (currentAge < 100) {
            currentHeight += years * 2
        }
        currentAge += years
    }
}