package lesson6.solution.alex.k.task3

class Walnut(name: String) : Tree(name) {

    override val maxAge: Int = (0..50).random()

    override val isAlive: Boolean
        get() = currentAge < maxAge

    override fun grow(years: Int) {
        if (!isAlive) return
        currentHeight += years * 0.5
        currentAge += years
    }
}