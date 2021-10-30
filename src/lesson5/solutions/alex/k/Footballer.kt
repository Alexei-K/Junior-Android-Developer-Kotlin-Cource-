package lesson5.solutions.alex.k

class Footballer(
    override val name: String,
    override val age: Int,
    val wins: Int,
    val looses: Int,
    val teamName: String
) : Human(name, age) {

    val games = looses + wins

    override fun getInfo() {
        println(
            "My class is ${Footballer::class.java.simpleName}, my name is $name. I am $age years old" +
                    "My team is $teamName, my winrate is ${wins.toFloat() / games.toFloat()}%"
        )
    }

    fun playFootball() {
        println("$name is playing football")
    }
}