package solutions.lesson4.solution_alex_k.extraTasks

class Watch(val model: String) {
     var isWorking: Boolean = true
    private val currentTime: Long = System.currentTimeMillis()

    fun getTime(): Long {
        // 1 раз из 10 часы ломаются
        val random = (1..10).random()
        if (random == 6) {
            breakWatch()
        }
        return if (isWorking) {
            currentTime
        } else {
            -1
        }
    }

    fun breakWatch() {
        println("$model сломались")
        isWorking = false
    }

    fun repair() {
        println("$model починили")
        isWorking = true
    }
}