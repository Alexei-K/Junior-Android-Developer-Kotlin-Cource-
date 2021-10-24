package solutions.lesson6.solution_ihor.task3

abstract class Tree() {
    abstract var maxYears: Int
    abstract var name: String
    abstract var currentYears: Int
    abstract var height: Double
    var alive: Boolean = true
        get() {
            if (currentYears > maxYears) {
                alive = false
            }
            return field
        }


    abstract fun grow(yearsPassed: Int)



}