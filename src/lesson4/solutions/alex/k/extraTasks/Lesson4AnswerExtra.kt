package lesson4.solutions.alex.k.extraTasks

/**
 * УРОК 4 РЕШЕНИЕ Дополнительных заданий для повторения
 */

fun main() {
    println("\n----Task 1----")
    val phone = Phone("Honor 20", 128000, "+37377793793")
    println("Номер телефона: ${phone.phoneNumber}, занято памяти : ${phone.memoryUsed}")
    phone.phoneNumber = "+380909070098"
    phone.memoryUsed = 10000
    println("Номер телефона: ${phone.phoneNumber}, занято памяти : ${phone.memoryUsed}")

    println("\n----Task 2----")
    val vodkaBottle = Bottle("Vodka", true, 2f)
    println("в бутылке ${vodkaBottle.currentVolume} литров водки")

    println("\n----Task 3----")
    Logger("someText").printInternalText()

    println("\n----Task 4----")
    val barmenVasia = Barman("Vasia", 37)
    println(barmenVasia.greet())

    println("\n----Task 5----")

    vodkaBottle.drink(0f)
    println(vodkaBottle.currentVolume)
    if (vodkaBottle.drink(6f)) {
        println("в бутылке ${vodkaBottle.currentVolume} литров водки")
    } else {
        println("Где моя водка?")
    }
    println("\n----Task 6----")

    println("\n----Task 7----")
    val rolex = Watch("Rolex")
    while (rolex.isWorking) {
        println(rolex.getTime())
    }
    rolex.repair()

    println("\n----Task 8----")
    val winston = Pet("кот", "Винстон", 80, true)
    val nick = Human("Nickita", winston)
    println(nick.getInfoAboutPet())

    println("\n----Task 9----")
    println(MotivationGenerator().getMotivatingPhrase())

    println("\n----Task 10----")
    val drinks = arrayOf(
        Bottle("Vodka", true, 2f),
        Bottle("Juice", false, 1f),
        Bottle("Water", false, 3f),
        Bottle("Absent", true, 2f),
    )
    val bar = Bar(drinks, barmenVasia)
    println(bar.drink("Vodka", 1f))
    println(bar.drink("Vodka", 1.5f))
    println(bar.drink("Beer", 0.5f))
    println(bar.drink("Absent", 3f))

}
/**
 * Задача 1
 * Создать класс Phone с перемнными memoryMax, memoryUsed, phoneNumber, model
 * Создать экземпляр класса, вывести его пременные в консоль
 * изменить 2-3 переменных и вывести в консоль новые значения переменных телефона
 */

/**
 * Задача 2
 * Создать класс Bottle с переменными name, isAlcohol, volume (литры), currentVolume(При создании бутылка полна)
 * Ответьте себе на вопрос чем отличается объявление переменных в теле класса и в конструкторе класса. Когда что использовать?
 */

/**
 * Задача 3
 * Исправить следующий класс, чтобы он компилировался (без добавления дополнительных переменных)
 */

class Logger(val _text: String) {

    init {
        println(_text)
    }

    fun printInternalText() {
        println(_text)
    }
}


/**
 * Задача 4
 * Создать класс Barmen  с переменными age, name. И методом greet() возвращающим приветствие (включая имя).
 */

/**
 * Задача 5
 * создать в классе Bottle метод drink принимающий float, отнимающий указанное количество жидкости от currentVolume
 * и возвращающим true, если было достаточно жидкости и false если не достаточно
 */

/**
 * Задача 6
 * Придумать 2 своих класса с 3+ переменными и 2+ методами.
 */

/**
 * Задача 7
 * Придумать класс Watch(наручные часы) с 3 переменными и 2 методами, взаимодействующими с переменными
 */

/**
 * Задача 8
 * Исправить класс Human(см. папку с заданием).
 * метод getInfoAboutPet() должен возвращает стрингу с именем хозяина и питомца.
 * Создать экземпляр класса Human и протестировать функцию
 */


/**
 * Задача 9
 *
 * Создать класс MotivationGenerator с методом getMotivatingPhrase возвращающим случайную мотивирующую фразу
 */

/**
 * Задача 10**
 * Создать Класс Bar хранящую в себе список Bottle и 1 Barman.
 *
 * И с методом getDrink принимающим название алкоголя и требуемых объем. Если такой напиток есть в баре -
 * из его текущего объема вычитается требуемый объем, а метод возвращает true. Если алкоголя в нужном количестве нет или
 * вообще нет - false.
 * Для простоты предположем что каждого напитка всего по 1 бутылке
 */

