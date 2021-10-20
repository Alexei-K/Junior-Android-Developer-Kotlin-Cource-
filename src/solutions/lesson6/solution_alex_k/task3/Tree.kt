package solutions.lesson6.solution_alex_k.task3

abstract class Tree(
    val maxYears: Int,
    val name: String
) {
    abstract var currentAge: Int
    abstract var currentHeight: Int

    abstract fun grow(years: Int)
}