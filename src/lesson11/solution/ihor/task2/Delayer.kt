package lesson11.solution.ihor.task2

typealias MilliSeconds = Long
typealias DelayedTask = () -> Unit

class Delayer {
    fun executeTasksWithDelayBetween(lambda1: DelayedTask, lambda2: DelayedTask, time: MilliSeconds) {
        lambda1()
        Thread.sleep(time)
        lambda2()
    }
}

fun task2() {
    val ihorDelayer = Delayer()
    ihorDelayer.executeTasksWithDelayBetween({ println("hello") }, { println("Slow Hello") }, 100)
}