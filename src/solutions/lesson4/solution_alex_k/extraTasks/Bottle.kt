package solutions.lesson4.solution_alex_k.extraTasks

class Bottle(var name: String, var isAlcohol: Boolean, val volume: Float) {
    var currentVolume: Float = volume
    fun drink(drinkVolume: Float): Boolean {
        if (drinkVolume <= currentVolume) {
            currentVolume - drinkVolume
            return true
        } else {
            currentVolume = 0f
            return false
        }
    }
}