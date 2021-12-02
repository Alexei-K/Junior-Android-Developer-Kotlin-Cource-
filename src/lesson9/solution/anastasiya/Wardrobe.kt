package lesson9.solution.anastasiya

class Wardrobe(var wardrobe: MutableList<Dress>) {
    override fun toString(): String {
        return wardrobe.toString()
    }
    fun putDress(whatDressPut: Dress) {
        wardrobe.add(whatDressPut)
    }

    fun removeDress(whatDressRemove: Dress) {
        wardrobe.remove(whatDressRemove)
    }

    fun findAllDressWithColor(howColor: String): List<Dress> {
//        val needDress = mutableSetOf<Dress>()
//        for (colorDress in wardrobe) {
//            if (colorDress.color == howColor) {
//                needDress.add(colorDress)
//            }
        return wardrobe.filter { it.color == howColor }
    }
}