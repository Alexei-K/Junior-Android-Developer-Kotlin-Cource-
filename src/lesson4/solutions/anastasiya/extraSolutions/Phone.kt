package lesson4.solutions.anastasiya.extraSolutions

class Phone (var memoryMax: Int, var memoryUsed: Int, var phoneNumber: String, var model: String) {
    fun getInfo (): String{
        val info = "$memoryMax, $memoryUsed, $phoneNumber, $model"
        return info
    }
}