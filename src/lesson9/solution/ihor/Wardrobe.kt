package lesson9.solution.ihor

class Wardrobe {
    var allClothes = mutableListOf<Dress>()
    fun putDress(dress: Dress) {
        allClothes.add(dress)
        println(allClothes)
    }

    fun removeDress(dress: Dress) {
        allClothes.remove(dress)
        println(allClothes)
    }

    fun findAllDressWithColor(color: String): List<Dress> {
        return allClothes.filter { it.colour == color }
    }


}