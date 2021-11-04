package lesson9.solution.ihor

import lesson7.solution.ihor.task1.FootballerModel

class FootballTeam(val name: String, val set: MutableSet<FootballerModel>) {
    fun hireFootballer(newFootballer: FootballerModel) {
        set.add(newFootballer)
        println("Here is our team $set")

    }

    fun fireFootballer(badFootballer: FootballerModel) {
        set.remove(badFootballer)
        println("Here is our team $set")

    }

    fun fireFootballerWithName(name: String) {
        var footballerSlot: FootballerModel? = null
        for (footballer in set) {
            if (footballer.name == name) {
                footballerSlot = footballer
            }
        }
        set.remove(footballerSlot)
        println(set)

    }
}