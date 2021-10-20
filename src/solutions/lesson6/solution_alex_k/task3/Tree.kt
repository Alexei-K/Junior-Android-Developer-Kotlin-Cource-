package solutions.lesson6.solution_alex_k.task3

abstract class Tree(
     val name: String
) {
     var currentAge: Int = 0
     var currentHeight: Int = 0
    abstract val maxYears: Int


    abstract var isAlive: Boolean

    abstract fun grow(years: Int)
}