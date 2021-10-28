package lesson6.solution.ihor.task3

class Forest(var name: String, var trees: Array<Tree>) {

    var isAlive: Boolean = true
        get() {
            var aliveForest: Boolean
            for (tree in trees) {
                if (tree.alive) {
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
                items.alive
            } else {
                println("Forest is dead")
            }
        }
    }


}