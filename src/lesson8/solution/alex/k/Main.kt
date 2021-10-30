package lesson8.solution.alex.k

import java.lang.Exception

/**
 * Урок 8
 */

/**
 * Задача 1.
 * Создать метод getInt(), который получает текст из консоли (readLine())
 * и Пытается превратить его в целое число (toInt())
 * если текст из консоли был null - выбросить Exception
 * После чего возвращает этот инт
 * Проверить что будет если ввести "аа" вместо числа
 */
fun main() {
    task1()
    task2()
    task3()
}

fun task1() {
    val number = getInt()
    println(number)
}

fun getInt(): Int {
    println("Input number")
    val text = readLine()
    text?.let {
        return it.toInt()
    } ?: throw Exception("text was null")
}

/**
 * Задача 2.
 * Создать метод startGame() которая предлагает певому игроку загадать случайное число от 1 до 10
 * Затем предлагает второму игроку угадать число и говорит сколько попыток понадобилось.
 * Для получения чисел использовать функцию из первого задания.
 * Вызывать функцию так, чтобы при вводе букв программа не крашила, а просто выводила в логи что это недопустимый ввод и
 * сама загадывала случайное число
 *
 */
fun task2() {
    startGame()
}

fun startGame() {
    println("Игрок 1 введит случайное число от 1 до 10")
    var player1Number = try {
        getInt()
    } catch (ex: Exception) {
        println("getInt() получило не число")
        (1..10).random()
    }
    println("Игрок 2 попробуйте угодать число")
    var counter = 0
    var secondPlayerNumber: Int? = null
    while (secondPlayerNumber == null) {
        var newNumber = try {
            getInt()
        } catch (ex: Exception) {
            println("getInt() получило не число")
            null
        }
        if (newNumber == player1Number) {
            secondPlayerNumber = newNumber
            println("Вы угадали!")
        } else {
            println("Вы не угадали.. Попробуйте еще")
        }
        counter++
    }
    println("Вы угадали число за $counter попыток!")
}

/**
 * Задача 3*
 * Получить 2 инта из класса BlackBox
 * Если первое число окажется null - написать в консол что первое число null (используя елвис)
 * Если второе число окажется null - написать в консол что второе число null (используя елвис)
 * Использую let вывести в консоль сумму чисел, если оба не null
 */

fun task3() {
    val blackBox = BlackBox()
    val int1 = blackBox.getIntOrNull()
    int1 ?: println("Первое число null")
    val int2 = blackBox.getIntOrNull()
    int2 ?: println("второе число null")
    int1?.let { _int1 ->
        int2?.let {
            println("$_int1+$it = ${_int1 + it}")
        }
    }
}

