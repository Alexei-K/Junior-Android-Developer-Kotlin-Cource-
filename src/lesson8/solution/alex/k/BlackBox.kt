package lesson8.solution.alex.k

class BlackBox {
    // Возвращает случайное число от 1 до 24 null
    fun getIntOrNull(): Int? {
        val x = (1..40).random()
        return if (x < 25) {
            x
        } else {
            null
        }
    }
}