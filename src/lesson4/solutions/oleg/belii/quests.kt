/* Задача 1
* Создать метод seriousGuy, который принимает имя человека(текст) и выводит в консоль "Mr. " и имя человека
*/
//fun main () {
//    seriousGuy()
//}
//fun seriousGuy () {
//    val name = "Вася"
//    println("Mr. $name")
//}

/**
 * Задача 2
 * Создать метод getJoke, который возвращает текст "Колобок повесился".
 */
//fun main () {
//    println(getJoke())
//}
//fun getJoke (): String {
//    return ("Колобок повесился")
//}

/**
 * Задача 3
 * Создать метод sum, который принимает 2 Int и возвращает их сумму.
 */
//fun main () {
//    val firstInt = 3
//    val secondInt = 5
//    println(sum(firstInt, secondInt))
//}
//fun sum (firstInt: Int, secondInt: Int): Int {
//    return (firstInt + secondInt)
//}

/**
 * Задача 4
 * Создать метод square, который принимает Int и возвращает это число в квадрате.
 */
//fun main() {
//    val squareInt = 3
//    println(sum(squareInt))
//}
//
//fun sum(squareInt: Int): Int {
//    val result = squareInt * squareInt
//    return (result)
//}


/**
 * Задача 5
 * Создать метод powerBy, который принимает 2 Int числа и возвращает результат возведения первого числа в степень второго числа.
 * Пример: для числе 2 и 4 вернется число 16
 */
//import kotlin.math.*
//fun main () {
//    val firstInt = 2
//    val secondInt = 4
//    val answer: Double = powerBy(firstInt.toDouble(), secondInt)
//    println(answer.toInt())
//}
//fun powerBy (firstInt: Double, secondInt: Int): Double {
//    val result = firstInt.pow(secondInt)
//    return (result)
//}

/**
 * Задача 6
 * Добавить 1 строчку кода в указаном месте, чтобы функция возвращала число 5
 * Если не получается, спойлер: смотри важный момент№4 в начале документа.
 */

//fun task6fun(): Int {
//    var number = 0
//    number = 1
//    number = 2
//    number = 3
//    number = 4
//    number = 5
//    return number
//    number = 6
//    number = 7
//    number = 8
//    return number
//}

/**
 * Задача 7
 * Добавить в метод ниже принимаемую переменную isDrunk, которая означает что водитель пьян.
 * Если она true, не выполнять всё остальное в методе.
 * Обязательное условие: в код этого метода нельзя добавлять фигурные скобки {}
 */

//fun drive(kilometer: Int, isDrunk: Boolean) {
//    if (isDrunk)
//    return
//    for (km in 1..kilometer) {
//        println("Проехали $km-й киллометр")
//    }
//    println("Приехали")
//}

/**
 * Задача 8
 * Создать метод который принимает фамилию человека и Boolean переменную IsMale(является ли мужчиной)
 * И возвращает "Mr." или "Mrs." + фамилию в зависимости от пола
 */
//fun main () {
//    humMail ("Иванов",true)
//    humMail ("Петрова", false)
//}
//fun humMail (surname: String, IsMale: Boolean) {
//    return if (IsMale)
//        println("Mr. $surname")
//    else
//        println("Mrs. $surname")
//}

/**
 * Задача 9
 * Создать метод formatToDollars, который принимает инт numberOfCents и char separator, а возвращает текст с долларами.
 * Примеры: принимает 9000 и '.' возвращает 90.00$
 * принимает 500 и ',' возвращает 5,00$
 */
//fun main () {
//    formatToDollars (9000, '.')
//    formatToDollars (500, ',')
//}
//fun formatToDollars (numberOfCents: Int, charseparator: Char) {
//    val y = numberOfCents / 100
//    val p = numberOfCents % 10
//    val o = numberOfCents / 10 % 10
//    val z = y.toString()+charseparator+o.toString()+p.toString()
//    println(z)
//}

/**
 * Задача 10
 * Создать функцию, принимающую инт, выводящую в консоль столько раз фразу "Ты молодец".
 * Задание со звездочкой(just for fun): эта функция возвращает float означающий сколько секунд
 * понадобилось программе на выполнение этого метода.
 */

fun main () {
    itsCool(3)
    justforfun()
}
fun itsCool (numItsCool: Int) {
    for (i in 1..numItsCool)
        println("Ты молодец")
}
fun justforfun(){
    val start = System.currentTimeMillis()
    Thread.sleep(3000)
    val end = System.currentTimeMillis()
    println("На выполнение метода ушло ${(end - start)/1000} секунд.")
}

