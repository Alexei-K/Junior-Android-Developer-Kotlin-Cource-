package lesson11.solution.alex.k

typealias Milliseconds = Long
typealias DelayedTask = () -> Unit

class Delayer {

    // Запускает task через указанное количество милисекунд
    fun launchWithDelay(delayInMillis: Milliseconds, task: DelayedTask) {
        Thread.sleep(delayInMillis)
        task()
    }

    fun executeTasksWithDelayBetween(delayInMillis: Milliseconds, task: DelayedTask, task2: DelayedTask) {
        task()
        Thread.sleep(delayInMillis)
        task2.invoke()
    }

}