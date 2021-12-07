package lesson8.solution.anastasiya

import lesson8.tasks.BlackBox

fun main() {
//    startGame()
//    val x: String? = "Alex"
//    x?.let{ someString ->
//        println(someString)
//    }
    val firstInt = BlackBox().getIntOrNull()
    val secondInt = BlackBox().getIntOrNull()
    firstInt?.let {first ->
        secondInt?.let { second ->
            println(first + second)
        } ?: println("the second number is null")
    } ?: println("the first number is null")
}

fun getInt(): Int {
    val textFromConsole: String? = readLine()
    return try {
        textFromConsole?.toInt() ?: throw NullPointerException()
    } catch (e: NumberFormatException) {
        println("This is invalid input.")
        val randomNumber = ((Math.random() * 10) + 1).toInt()
        println("RandomNumber: $randomNumber")
        randomNumber
    }
}

fun startGame() {
    println("First player, enter a number between 1 and 10.")
    var firstNumber = getInt()
    while (firstNumber !in 0..10) {
        println("This is invalid input.")
        firstNumber = getInt()
    }
    println("The second player guesses a number from 1 to 10 entered by the first player.")
    var secondNumber = getInt()
    while (secondNumber !in 0..10) {
        println("This is invalid input.")
        secondNumber = getInt()
    }
    var attempt = 1
    while (secondNumber != firstNumber) {
        println("Wrong! Try again.")
        secondNumber = getInt()
        attempt += 1
    }
    println("The second player guesses correctly on the $attempt try")

}
