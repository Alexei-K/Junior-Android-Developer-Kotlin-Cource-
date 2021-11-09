package lesson5.solutions.belii

class Footballer(
    override val name: String,
    override val age: Int,
    val wins: Double,
    val looses: Double,
    val teamName: String
) : Human(name, age) {
    override fun getInfo() {
        val persentWins = wins / (wins + looses) * 100
        println("${Human::class.java.simpleName}: $name; $persentWins; $teamName")
    }

    fun playFootball() {
        println("Спартак чемпион!")
    }

}