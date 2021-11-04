package lesson5.solutions.anastasiya

open class Human (open val name: String,val age: Int) {
    open fun getInfo() {
        println("Имя класса ${this::class.simpleName}, имя человека $name")
    }
    override fun toString(): String {
        return name
    }
}