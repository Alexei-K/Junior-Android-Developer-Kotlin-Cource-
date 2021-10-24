package solutions.lesson6.solution_ihor.task3

import kotlin.random.Random

class AppleTree : Tree() {
    override var maxYears: Int = Random.nextInt(0, 80)
    override var name: String = "Oak"
    override var currentYears: Int = 0
    override var height: Double = 0.0


    override fun isAlive(): Boolean {
        if (currentYears > maxYears) alive = false
        return alive
    }

    override fun grow(yearsPassed: Int) {
        if (isAlive()) {
            if (currentYears < 3) {
                height += yearsPassed * 2
            }
            height += yearsPassed * 0.5
            currentYears += yearsPassed
        }

    }
}