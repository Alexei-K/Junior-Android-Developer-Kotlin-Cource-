package lesson6.solution.ihor.task3

import kotlin.random.Random

class AppleTree : Tree() {
    override var maxYears: Int = Random.nextInt(0, 80)
    override var name: String = "Oak"
    override var currentYears: Int = 0
    override var height: Double = 0.0




    override fun grow(yearsPassed: Int) {
        if (alive) {
            if (currentYears < 3) {
                height += yearsPassed * 2
            }
            height += yearsPassed * 0.5
            currentYears += yearsPassed
        }

    }
}