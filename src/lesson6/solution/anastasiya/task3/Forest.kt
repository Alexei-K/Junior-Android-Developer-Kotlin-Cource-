package lesson6.solution.anastasiya.task3

class Forest(val name: String, val trees: Array<Tree>) {
    fun someYearsPassed(years: Int) {
        for (init in trees) {
            init.grow(years)
        }
    }

    fun forestAlive(): Boolean {
        for (tree in trees) {
            if (tree.isAlive()) {
                return true
            }
        }
        return false
    }

    fun getAliveTrees(): String {
        var result = ""
        for (tree in trees) {
            if (tree.isAlive()) {
                result += "$tree\n"
            }
        }
        return result
    }
}