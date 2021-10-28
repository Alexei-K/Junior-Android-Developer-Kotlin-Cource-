package lesson4.solutions.alex.k.extraSolutions

class Bar(var bottles: Array<Bottle>, val barman: Barman) {

    fun drink(name: String, volume: Float): Boolean {
        var bottle: Bottle? = null
        for (one in bottles) {
            if (one.name == name) {
                bottle = one
            }
        }
        if (bottle == null) {
            return false
        }
        if (bottle.currentVolume < volume) {
            return false
        }
        bottle.currentVolume -= volume
        return true

    }
}