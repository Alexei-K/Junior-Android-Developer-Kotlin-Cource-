package lesson7.solution.alex.k.task1

import lesson5.solutions.alex.k.Human


data class FootballerModel(
    override val name: String,
    override val age: Int,
    val wins: Int,
    val looses: Int,
    val teamName: String
) : Human(name, age) {

    val games = looses + wins

    override fun getInfo() {
        println(
            "My class is ${this::class.java.simpleName}, my name is $name. I am $age years old" +
                    "My team is $teamName, my winrate is ${wins.toFloat() / games.toFloat()}%"
        )
    }

    fun playFootball() {
        println("$name is playing football")
    }
}
