package solutions.lesson6.solution_ihor.task3

import kotlin.random.Random

class Oak : Tree() {
    override var maxYears: Int = Random.nextInt(0, 200)
    override var name: String = "Oak"
    override var currentYears: Int = 0
    override var height: Double = 0.0





    override fun grow(yearsPassed: Int) {
        if (alive) {
            if (currentYears < 100) {
                height += yearsPassed * 2
            }
            currentYears += yearsPassed
        }
    }


}