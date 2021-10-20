package solutions.lesson6.solution_alex_k.task3

class Forest(private val trees: Array<Tree>) {

    fun someYearsPast(years: Int) {
        for (tree in trees) {
            tree.grow(years)
        }
    }

    val isAlive: Boolean
        get() = trees.filter { tree -> tree.isAlive }.isNotEmpty()
}