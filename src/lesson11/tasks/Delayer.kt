package lesson11.tasks

class Delayer {

    // Запускает task через указанное количество милисекунд
    fun launchWithDelay(delayInMillis: Long, task: () -> Unit) {
        Thread.sleep(delayInMillis)
        task()
    }
}