package solutions.lesson6.solution_alex_k.task3

abstract class Tree(
     val name: String
) {
     var currentAge: Int = 0
     var currentHeight: Double = 0.0
    abstract val maxAge: Int


    abstract val isAlive: Boolean

    abstract fun grow(years: Int)
}