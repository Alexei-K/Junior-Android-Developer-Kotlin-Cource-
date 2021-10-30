package lesson7.solution.ihor.task1

class Footballer(
    val name: String,
    val age: Int,
    val wins: Double,
    var loses: Double,
    var teamName: String
) {
    val winPercent: Double = ((wins + loses) / wins) * 100
    fun getInfo() {
        println("My name is $name")
        println("I am ${javaClass.simpleName}")
        println("I am playing for $teamName")
        println("Percent of my win is $winPercent")

    }

    fun playFootbal() {
        println("Goal!!")
    }
}