package lesson9.solution.anastasiya

import lesson7.solution.anastasiya.task1.FootballerModel

class FootballTeam(val nameTeam: String, var players: MutableSet<FootballerModel>) {
    override fun toString(): String {
        return nameTeam + players.toString()
    }

    fun hireFootballer(newFootballer: FootballerModel) {
        players.add(newFootballer)
    }

    fun fireFootballer(whoToFire: FootballerModel) {
        players.remove(whoToFire)
    }

    fun fireFootballerWithName(nameWhoFire: String) {
        var x: FootballerModel? = null
        for (player in players) {
            if (player.hisName == nameWhoFire) {
                x = player
            }
        }
        players.remove(x)
//        players.removeIf { it.hisName==nameWhoFire }
    }
}