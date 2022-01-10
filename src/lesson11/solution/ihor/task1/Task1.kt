package lesson11.solution.ihor.task1

import lesson11.tasks.Delayer


fun task1() {
    val delayer = Delayer()
    delayer.launchWithDelay(100) { println("hi") }
}
