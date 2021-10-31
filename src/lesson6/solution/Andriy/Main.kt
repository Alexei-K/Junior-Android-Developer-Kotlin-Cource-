package lesson6.solution.Andriy

import lesson6.solution.Andriy.task1.ElectroSocket
import lesson6.solution.Andriy.task1.IPhone
import lesson6.solution.Andriy.task1.Tesla
import lesson6.solution.Andriy.task2.decodeWebError
import lesson6.solution.Andriy.task3.AppleTree
import lesson6.solution.Andriy.task3.Forest
import lesson6.solution.Andriy.task3.Oak
import lesson6.solution.Andriy.task3.Walnut

//fun main() {
//    val tesla = Tesla()
//    val iPhone = IPhone()
//    val weakSocket = ElectroSocket(2f)
//    val powerfulSocket = ElectroSocket(12f)
//    weakSocket.charge(iPhone)
//    powerfulSocket.charge(tesla)
//}
//
//fun main2() {
//    decodeWebError(90)
//    decodeWebError(650)
//    decodeWebError(200)
//    decodeWebError(404)
//    decodeWebError(408)
//    decodeWebError(525)
//}

fun main3() {
    val forest = Forest(
        "Bear forest",
        arrayOf(
            Oak("Дуб1"),
            Oak("Дуб2"),
            AppleTree("Яблоня"),
            Walnut("Орех1"),
            Walnut("Орех2"),
            Walnut("Орех3"),
        )
    )
    val forest2 = Forest(
        "Unicorn forest",
        arrayOf(
            Oak("Дуб3"),
            AppleTree("Яблоня2"),
            AppleTree("Яблоня3"),
            Walnut("Орех4"),
            Walnut("Орех5"),
            Walnut("Орех6"),
        )
    )

    while (forest.isAlive && forest2.isAlive) {
        val yearsPassed = (10..20).random()
        forest.someYearsPast(yearsPassed)
        forest2.someYearsPast(yearsPassed)
    }
    if (!forest.isAlive && !forest2.isAlive) {
        println("Both forests are dead")
    } else {
        val aliveForest = if (forest.isAlive) forest else forest2
        println("Forest \"${aliveForest.name}\" survived")

        for (tree in aliveForest.trees) {
            if (tree.isAlive) {
                println("Tree ${tree.name} of type ${tree.javaClass.simpleName} is ${tree.currentAge} old and ${tree.currentHeight} height")
            }
        }
    }
}