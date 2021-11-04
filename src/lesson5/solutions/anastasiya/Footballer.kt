package lesson5.solutions.anastasiya

class Footballer (override val name: String, age: Int, var wins: Int, var looses: Int, var teamName: String): Human (name, age) {
    override fun getInfo() {
        println("Имя класса ${this::class.simpleName}, имя человека $name, клуб $teamName, процент побед $wins %")
    }
    fun playFootball() {
        println("$name играет в футбол с детства")
    }
}