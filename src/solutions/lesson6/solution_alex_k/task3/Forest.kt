package solutions.lesson6.solution_alex_k.task3

class Forest(val name: String,  val trees: Array<Tree>) {

    fun someYearsPast(years: Int) {
        for (tree in trees) {
            tree.grow(years)
        }
    }

    val isAlive: Boolean
        get() {
            for (tree in trees) {
                if (tree.isAlive) {
                    return true
                }
            }
            return false
        }
    // Simple solution:
    // val isAlive: Boolean
    // get() = trees.filter { tree -> tree.isAlive }.isNotEmpty()


}