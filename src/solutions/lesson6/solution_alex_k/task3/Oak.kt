package solutions.lesson6.solution_alex_k.task3

class Oak(name: String) : Tree(name) {

    override val maxYears: Int
        get() = 200


    override var isAlive: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun grow(years: Int) {
        TODO("Not yet implemented")
    }
}