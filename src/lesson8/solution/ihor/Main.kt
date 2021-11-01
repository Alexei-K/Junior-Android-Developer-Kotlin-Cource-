package lesson8.solution.ihor

import kotlin.random.Random

fun main() {
    startGame()
    val box = BlackBox()
    val firstInt = box.getIntOrNull()
    firstInt ?: println("First number = null")
    val secondInt = box.getIntOrNull()
    secondInt ?: println("Second number = null")
    val sum: Int
    firstInt?.let { int1 ->
        secondInt?.let {
            sum = int1 + it
            println(sum)
        }

    }


}

fun getInt(): Int? {
    val userInput: String? = readLine()
    var userInt: Int? = null
    try {
        userInt = userInput?.toInt()
    } catch (e: Exception) {
        println(e.message)
        userInt = Random.nextInt(0, 10)
    }
    return userInt

}

fun startGame() {
    println("Enter number from 0 to 10")
    val randomInt = getInt()
    var counter = 1
    println("Try to guess: ")
    var userInput = getInt()
    while (userInput != randomInt) {
        println("Try to guess: ")
        userInput = getInt()
        counter++
    }
    println("You guessed the number $randomInt on $counter try")


}