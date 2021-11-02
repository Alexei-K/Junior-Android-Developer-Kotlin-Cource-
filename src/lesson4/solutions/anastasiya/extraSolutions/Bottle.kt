package lesson4.solutions.anastasiya.extraSolutions

class Bottle(var name: String, var isAlcohol: Boolean, volume: Float) {
    var currentVolume = volume
    fun drink(someVolume: Float): Boolean {
        if (someVolume<=currentVolume) {
            currentVolume -= someVolume
            return true
        } else {
            return false
        }
    }
}