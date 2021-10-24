package solutions.lesson7.solution_alex_k

import solutions.lesson5.solution_alex_k.Footballer
import solutions.lesson6.solution_alex_k.task1.Tesla
import solutions.lesson7.solution_alex_k.task1.FootballerModel
import solutions.lesson7.solution_alex_k.task2.ModernSocket
import solutions.lesson7.solution_alex_k.task3.UniversalSocket


/**
 * Урок 7
 */

/**
 * Задача 1.
 * Превратить класс Footballer из 5 урока 2 задачи в дата класс, назвать его FootballerModel.
 * Создать по 1 Footballer и FootballerModel и вывести эти объекты в консоль (println(footballerName))
 * Затем нужно увеличить количество побед у FootballerModel. (переменная wins должна быть val как принято в data class)
 * и снова выведите этот объект в косноль
 */

fun main1() {
    val ronaldo = Footballer("Ronaldo", 33, 99, 21, "Barselona")
    var messiModel = FootballerModel("Messi", 31, 1000, 1, "Liverpool")
    println(ronaldo)
    println(messiModel)
    messiModel.playFootball()
    println("WIN!")
    messiModel = messiModel.copy(wins = messiModel.wins + 1)
    println(messiModel)
}

/**
 * Задача 2
 * Создать класс ModernSocket, который наследуется от ElectroSocket из 6ого урока 1 задачи
 * Перегрузить метод charge добавив следующии реализации:
 * 1) Принимающий девайс который нужно заряжать и chargePower:float, который показывает какую долю мощности
 * ModernSocket должен отдавать этому девайсу при зарядке
 * 2) Принимающий 2 девайса и заряжающий сначала первый, потом второй
 *
 * Создать ModernSocket и 4 Tesla
 * опробовать все 3 метода charge
 */
fun main2() {
    val tesla1 = Tesla()
    val tesla2 = Tesla()
    val tesla3 = Tesla()
    val tesla4 = Tesla()
    val modernSocket = ModernSocket(5f)
    modernSocket.charge(tesla1)
    modernSocket.charge(tesla2, 0.5f)
    modernSocket.charge(tesla3, tesla4)
}

/**
 * Задача 3*
 * Создать класс UniversalSocket имеющий 1 переменную как у ElectroSocket и 1(!!!) метод charge
 * в котором реализованы все 3 метода ModernSocket
 * При этом следующий код должен запускаться:
 */
fun main3() {
    val universalSocket = UniversalSocket(15f)
    val tesla1 = Tesla()
    val tesla2 = Tesla()
    universalSocket.charge(tesla1)
    universalSocket.charge(tesla1, 0.8f)
    universalSocket.charge(tesla1, 0.8f, tesla2)
    universalSocket.charge(tesla1, secondDevice = tesla2)
}