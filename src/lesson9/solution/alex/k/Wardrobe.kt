package lesson9.solution.alex.k

class Wardrobe {
    var dressList = mutableListOf<Dress>()
    fun putDress(dress: Dress) {
        dressList.add(dress)
    }

    fun removeDress(dress: Dress) {
        dressList.remove(dress)
    }

    fun findAllDressWithColor(color: String): List<Dress> {
        val dressWithColor = dressList.filter { it.color == color }
        return dressWithColor
    }
}