package lesson9.solution.alex.k

import lesson7.solution.alex.k.task1.FootballerModel

// Используется MutableSet потому что не должно в команде быть 2 одинаковых футболиста
data class FootballTeam(val name: String, var players: MutableSet<FootballerModel>) {
    fun hireFootballer(player: FootballerModel) {
        players.add(player)
    }

    fun fireFootballer(player: FootballerModel) {
        players.remove(player)
    }

    fun fireFootballerWithName(name: String) {
        players.removeIf {
            it.name == name
        }
    }
}