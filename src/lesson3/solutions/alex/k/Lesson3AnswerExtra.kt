package lesson3.solutions.alex.k


/**
 * УРОК 3 Ответы на Дополнительные задания для повторения
 */

fun main() {
    println("----Task 1----")
    seriousGuy("Alex")

    println("----Task 2----")
    println(getJoke())

    println("----Task 3----")
    println(sum(300, 22))

    println("----Task 4----")
    println(square(99))

    println("----Task 5----")
    println(powerBy(10, 3))

    println("----Task 6----")
    println(lesson3.tasks.task6fun())

    println("----Task 7----")
    println("Not drunk:")
    drive(3, false)
    println("Drunk:")
    drive(3, true)

    println("----Task 8----")
    println(addMr("Alex", true))
    println(addMr("Nastia", false))

    println("----Task 9----")
    println(formatToDollars(9000, '.'))
    println(formatToDollars(101, ','))
    println("----Task 10----")
    val timeInSeconds = youAreCool(100)
    println("Программа заняла $timeInSeconds секунд")
}

/**
 * Задача 1
 * Создать метод seriousGuy, который принимает имя человека(текст) и выводит в консоль "Mr. " и имя человека
 */
fun seriousGuy(name: String) {
    println("Mr. $name")
}

/**
 * Задача 2
 * Создать метод getJoke, который возвращает текст "Колобок повесился".
 */
fun getJoke(): String {
    return "Колобок повесился"
}

/**
 * Задача 3
 * Создать метод sum, который принимает 2 Int и возвращает их сумму.
 */

fun sum(int1: Int, int2: Int): Int {
    return int1 + int2
}

/**
 * Задача 4
 * Создать метод square, который принимает Int и возвращает это число в квадрате.
 */
fun square(number: Int): Int {
    return number * number
}

/**
 * Задача 5
 * Создать метод powerBy, который принимает 2 Int числа и возвращает результат возведения первого числа в степень второго числа.
 * Пример: для числе 2 и 4 вернется число 16
 */
fun powerBy(base: Int, power: Int): Int {
    var result = 1
    for (times in 1..power) {
        result *= base
    }
    return result
}

/**
 * Задача 6
 * Добавить 1 строчку кода в указаном месте, чтобы функция возвращала число 5
 * Если не получается, спойлер: смотри важный момент№4 в начале документа.
 */

fun task6fun(): Int {
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

fun drive(kilometer: Int, isDrunk: Boolean) {
    if (isDrunk) {
        println("Вы пьяны. Никуда не едем")
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
fun addMr(name: String, isMale: Boolean): String {
    val prefix = if (isMale) {
        "Mr."
    } else {
        "Mrs."
    }
    return "$prefix $name"
}

/**
 * Задача 9
 * Создать метод formatToDollars, который принимает инт numberOfCents и char separator, а возвращает текст с долларами.
 * Примеры: принимает 9000 и '.' возвращает 90.00$
 * принимает 500 и ',' возвращает 5,00$
 */
fun formatToDollars(value: Int, seperator: Char): String {
    val cents = value % 100
    val centsString = if (cents < 10) {
        "0$cents"
    } else {
        cents.toString()
    }
    val dollars = value / 100
    return "$dollars$seperator$centsString$"

}

/**
 * Задача 10
 * Создать функцию, принимающую инт, выводящую в консоль столько раз фразу "Ты молодец".
 * Задание со звездочкой(just for fun): эта функция возвращает float означающий сколько секунд
 * понадобилось программе на выполнение этого метода.
 */

fun youAreCool(times: Int): Float {
    var time = System.currentTimeMillis()
    for (i in 0..times) {
        //Код закоментировал, чтобы были видны выводы других заданий
        //println("Ты молодец")
        //симуляция нагрузки, как будто каждый println занимает 1мс
        Thread.sleep(1)
    }

    val timeSpent = System.currentTimeMillis() - time
    val timeInSeconds = timeSpent.toFloat() / 1000
    return timeInSeconds
}