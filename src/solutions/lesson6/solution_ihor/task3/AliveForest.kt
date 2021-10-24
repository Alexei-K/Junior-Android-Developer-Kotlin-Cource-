package solutions.lesson6.solution_ihor.task3

class AliveForest(var winningForest: Forest) {
    fun print() {
        println("${winningForest.name} have won")
        for (item in winningForest.trees) {
            println(
                "in this forest have been ${item.javaClass.simpleName} it was " +
                        "${item.currentYears} years and have " +
                        "${item.height} height"
            )
            if (item.isAlive()) {
                println("But alive only ${item.javaClass.simpleName} with age ${item.currentYears}")
            }
        }
    }
}