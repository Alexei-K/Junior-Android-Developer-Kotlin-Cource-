package solutions.lesson5.andriyK

open class Human(open var name: String, open var age: Int) {
    open fun getInfo() {
        println("Human")
        println(name)
    }

    override fun toString(): String {
        return name
    }
}

class Footballer(
    override var name: String = "",
    override var age: Int = 0,
    var wins: Int = 0,
    var looses: Int = 0,
    var teamName: String = "madrid"
) : Human(name, age) {
    override fun getInfo() {
        println("Footballer")
        println(name)
    }

    fun playFootball() {
        println(wins)
    }


}

