package lesson5.solutions.anastasiya

fun main() {
    task1()
    task2()
    task3()
}

fun task1() {
    val house = House ()
    val hospital = Hospital()
}

fun task2() {
    var arrayHuman = arrayOf(Human("Kris", 31), Human("Joni", 28))
    var arrayFootballer =
        arrayOf(Footballer("Ronaldo", 40, 70, 30, "Spartak"), Footballer("Kaka", 33, 65, 35, "Guliver"))
    for (item in arrayHuman) {
        item.getInfo()
        println(item.toString())
    }
    for (item in arrayFootballer) {
        item.getInfo()
        item.playFootball()
        println(item.toString())
    }
}

fun task3() {
    var arrayHumanFootballer = arrayOf(
        Human("Kris", 31), Human("Joni", 28),
        Footballer("Ronaldo", 40, 70, 30, "Spartak"),
        Footballer("Kaka", 33, 65, 35, "Guliver")
    )
    for (item in arrayHumanFootballer) {
        println(item)
    }
}