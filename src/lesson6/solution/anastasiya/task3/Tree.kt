package lesson6.solution.anastasiya.task3

abstract class Tree {
    abstract var height: Double
    abstract var currentAge:Int
    abstract var maxYears: Int
    abstract var name: String
    abstract fun grow(pastYears: Int)
    fun isAlive(): Boolean {
        return currentAge <= maxYears
    }

    override fun toString(): String {
        return "$name, ${this::class.simpleName} $height $currentAge"
    }
}