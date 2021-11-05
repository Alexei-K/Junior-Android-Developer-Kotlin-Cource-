import kotlin.math.pow
fun main (){
    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
    task7()
    task8()
    task9()
    task10()
}
/* Задача 1
* Создать метод seriousGuy, который принимает имя человека(текст) и выводит в консоль "Mr. " и имя человека
*/
fun task1 () {
    val name = "Вася"
    seriousGuy(name)
}
fun seriousGuy (name: String) {

    println("Mr. $name")
}

/**
 * Задача 2
 * Создать метод getJoke, который возвращает текст "Колобок повесился".
 */
fun task2 () {
    println(getJoke())
}
fun getJoke (): String {
    return "Колобок повесился"
}

/**
 * Задача 3
 * Создать метод sum, который принимает 2 Int и возвращает их сумму.
 */
fun task3 () {
    val firstInt = 3
    val secondInt = 5
    println(sum(firstInt, secondInt))
}
fun sum (firstInt: Int, secondInt: Int): Int {
    return firstInt + secondInt
}

/**
 * Задача 4
 * Создать метод square, который принимает Int и возвращает это число в квадрате.
 */
fun task4 () {
    val squareInt = 3
    println(square(squareInt))
}

fun square(squareInt: Int): Int {
    return squareInt.toDouble().pow(2).toInt()
//    return squareInt * squareInt
}


/**
 * Задача 5
 * Создать метод powerBy, который принимает 2 Int числа и возвращает результат возведения первого числа в степень второго числа.
 * Пример: для числе 2 и 4 вернется число 16
 */

fun task5 () {
    val firstInt = 2
    val secondInt = 4
    val answer = powerBy(firstInt, secondInt)
    println(answer)
}
fun powerBy(firstInt: Int, secondInt: Int): Int {
    return firstInt.toDouble().pow(secondInt).toInt()
}

/**
 * Задача 6
 * Добавить 1 строчку кода в указаном месте, чтобы функция возвращала число 5
 * Если не получается, спойлер: смотри важный момент№4 в начале документа.
 */

fun task6 (): Int {
    var number = 0
    number = 1
    number = 2
    number = 3
    number = 4
    number = 5
    return number
    number = 6
    number = 7
    number = 8
    return number
}

/**
 * Задача 7
 * Добавить в метод ниже принимаемую переменную isDrunk, которая означает что водитель пьян.
 * Если она true, не выполнять всё остальное в методе.
 * Обязательное условие: в код этого метода нельзя добавлять фигурные скобки {}
 */
fun task7 () {
    drive(5, false)
}
fun drive(kilometer: Int, isDrunk: Boolean) {
    if (isDrunk) {
        return
    }
    for (km in 1..kilometer) {
        println("Проехали $km-й киллометр")
    }
    println("Приехали")
}

/**
 * Задача 8
 * Создать метод который принимает фамилию человека и Boolean переменную IsMale(является ли мужчиной)
 * И возвращает "Mr." или "Mrs." + фамилию в зависимости от пола
 */
fun task8 () {
    println(humMail("Иванов", true))
    println(humMail("Петрова", false))
}

fun humMail(surname: String, IsMale: Boolean): String {
    return if (IsMale) {
        "Mr. $surname"
    } else {
        "Mrs. $surname"
    }
}

/**
 * Задача 9
 * Создать метод formatToDollars, который принимает инт numberOfCents и char separator, а возвращает текст с долларами.
 * Примеры: принимает 9000 и '.' возвращает 90.00$
 * принимает 500 и ',' возвращает 5,00$
 */
fun task9 () {
    println(formatToDollars(1234, '.'))
    println(formatToDollars(500, ','))
}

fun formatToDollars(numberOfCents: Int, charSeparator: Char): String {
    val dollars = numberOfCents / 100
    val number1 = numberOfCents % 10
    val number2 = numberOfCents / 10 % 10
    val result = dollars.toString() + charSeparator + number2.toString() + number1.toString()
    return "$result$"
}

/**
 * Задача 10
 * Создать функцию, принимающую инт, выводящую в консоль столько раз фразу "Ты молодец".
 * Задание со звездочкой(just for fun): эта функция возвращает float означающий сколько секунд
 * понадобилось программе на выполнение этого метода.
 */

fun task10 () {
    itsCool(1000)
    justforfun()
}
fun itsCool (numItsCool: Int) {
    for (i in 1..numItsCool)
        println("Ты молодец")
}
fun justforfun(){
    val start = System.currentTimeMillis()
//    Thread.sleep(3000)
    itsCool(1000)
    val end = System.currentTimeMillis()
    println("На выполнение метода ушло ${(end - start).toFloat()/1000} секунд.")
}

