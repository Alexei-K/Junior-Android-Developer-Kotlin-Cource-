package com.kolis.test_catalog_app.studying.lesson6.solution

import solutions.lesson6.solution_alex_k.task1.ElectroSocket
import solutions.lesson6.solution_alex_k.task1.IPhone
import solutions.lesson6.solution_alex_k.task1.Tesla

/**
 * Урок 6
 */

/**
 * Задача 1.
 * Создать интерфейс Chargeable c методом charge(chargePercentPerMinute) - зарядить
 * устройство ( при этом выводит в консоль текущий заряд каждую "минуту" пока он не станет 100 и название класса)
 * и переменной currentCharge:Float - текущий заряд устройства (не может быть меньше 0 и больше 100)
 * Создать классы IPhone, Tesla . Все они реализуют интерфейс Chargeable.
 * При это Iphone после 80% зарядки принимает только половину заряда, что передаётся ему методом charge (до этого всю)
 * А тесла всегда принимает только 75% от поступаемой энергии
 *
 * Создать класс ElectroSocket с переменной chargePercentPerMinute - на сколько процентов эта розетка заряжает в минуту
 * и методом chargeDevice, принимающим любой класс, реализующий интерфес chargable и вызывающий  у него метод charge()
 * Создать слабый и сильный ElectroSocket. Одним зарядить айфон, другим - теслу.
 */

fun main1() {
    val tesla = Tesla()
    val iPhone = IPhone()
    val weakSocket = ElectroSocket(2.5f)
    val powerfulSocket = ElectroSocket(12.5f)
    weakSocket.charge(iPhone)
    powerfulSocket.charge(tesla)
}

/**
 * Задача 2
 * Создать метод decodeWebError()
 *  который принимает error:Int и выводит в консоль :
 *  если код меньше 100 или больше 600 - "Not valid code"
 *  если код начинается на "2" - "ОК"
 *  если код 404 - " Web site not found"
 *  если любой другой код начинающийся на 4 - "Unknown error" + код ошибки
 *  для всех остальных вариантов - "The code (номер кода) is valid,
 *  but unknown. Check it here:https://siterost.net/post/http-status-codes"
 *
 *  Программа не должна содержать ни 1 if
 */
fun main2() {
    decodeWebError(90)
    decodeWebError(650)
    decodeWebError(200)
    decodeWebError(404)
    decodeWebError(408)
    decodeWebError(525)
}

/**
 * Задача 3**
 * Создаем небольшой симулятор леса.
 * Класс Forest содержит массив Tree
 * Класс Forest имеет метод someYearsPassed(years:Int) который вызывает у всех живых деревье метод grow()
 *
 *
 * Класс Tree является абстрактным и имеет переменные maxYears, name(or id)
 * так же есть метод grow() который принимает количество прошедших лет. В зависимости от
 * этого меняется текущий возраст и рост. Так же у дерева есть  метод "isAlive()" который возвращает false
 * если текущий возраст дерева больше, чем его максимальный возраст.
 *
 * Создать 3 класса, которые наследуются от Tree.
 * класс Oak с максимальным возрастом 200 лет, ростёт только первые 100 лет по 2 м в год
 * класс AppleTree с максимальным возрастом 80 лет, ростёт  первые 3 год по 2 м, все последющие года по 0.5 метра
 * класс Walnut с максимальным возрастом 50 лет, ростёт всю жизнь по пол метра в год
 *
 * Все переменные, которые встретились во всех 3 классах - вынести в абстрактный класс
 *
 * В методе Main создать 2 леса по 6 деревьев в каждом (в премешку дубы,ябони и орехи).
 * Затем у каждого леса вызываем метод someYearsPassed со случайным значением от 10 до 20 пока в одном
 * из лесов не останется живых деревьев.
 *
 * В конце программа выводит какой лес остался жив и список его живых деревьев.
 */

fun main() {

}