package solutions.lesson6.solution_ihor.task3

import kotlin.random.Random

class Walnut : Tree() {
    override var maxYears: Int = Random.nextInt(0, 50)
    override var name: String = "Oak"
    override var currentYears: Int = 0
    override var height: Double = 0.0


    override fun isAlive(): Boolean {
        if (currentYears > maxYears) alive = false
        return alive
    }

    override fun grow(yearsPassed: Int) {
        if (isAlive()) {
            height += yearsPassed * 0.5
            currentYears += yearsPassed
        }
    }
}