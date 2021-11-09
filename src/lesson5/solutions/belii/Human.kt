package lesson5.solutions.belii

open class Human(open val name: String, open val age: Int) {
    open fun getInfo() {
        println("${Human::class.java.simpleName}: $name")
    }

}