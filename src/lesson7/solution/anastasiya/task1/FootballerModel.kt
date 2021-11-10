package lesson7.solution.anastasiya.task1

import lesson5.solutions.anastasiya.Human

data class FootballerModel(val hisName: String,val hisAge: Int, val wins: Int, val looses: Int, val teamName: String) {
    fun playFootball() {
        println("$hisName играет в футбол с детства")
    }

}