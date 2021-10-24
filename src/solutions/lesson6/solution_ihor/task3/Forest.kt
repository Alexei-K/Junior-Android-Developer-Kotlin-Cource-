package solutions.lesson6.solution_ihor.task3

class Forest(var name: String, var trees: Array<Tree>) {

    var isAlive: Boolean = true
        get() {
            var aliveForest: Boolean
            for (tree in trees) {
                if (tree.isAlive()) {
                    aliveForest = true
                    isAlive = aliveForest
                }
            }
            return field

        }

    fun someYearsPassed(years: Int) {
        for (items in trees) {
            if (isAlive) {
                items.grow(years)
                items.isAlive()
            } else {
                println("Forest is dead")
            }
        }
    }


}