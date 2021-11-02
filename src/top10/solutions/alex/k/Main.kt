package top10.solutions.alex.k

import java.lang.Exception

/**
 * Top 10 Тем!
 * (темы № 2,3,6,7)
 * Один лишь шаг остался.
 * Но он наследие для умных или сильных.
 */


fun main() {
    theme2()
    theme3()
    theme6()
    theme7()
}

/**
 * Тема 2
 * Создать класс SecureText
 * в котором из переменных будет текст и пароль для его получения.
 * А из методов - getTextByPassword принимающий пароль и возвращающий текст если правильный пароль и
 * выбрасывающий ошибку если не правильный
 * Снаружи класса не должно бвть доступа к переменным. Только к 1 методу.
 */

fun theme2() {
    println("\n\n ----Theme 2----")
    val secretText = SecureText("7777", "My google play account  password is 12345678")
    println(secretText.getTextByPassword("7777"))
    try {
        println(secretText.getTextByPassword("wrong password"))
    } catch (ex: Exception) {
        println("Wrong password, app would crashed, but I cought an exception ")
    }

}

/**
 * Тема 3
 * Создать enum класс Currency представляющий сабой валюты (Евро, Шекель, Доллар, гривна). И имеющий 2 переменных: _name и
 * rateToDollar.(например Hrivna с rateToDollar = 26.08, означает, что 1 доллар равен 26.08 гривнам).
 * Создать класс Exchanger с методом exchangeToDollars, принимающее сумму(2000.0) и валюту которую будем
 * менять на доллары(enum). И возвращающую сколько долларов мы получим.
 * При этом берется 1% комиссии за обмен Евро, 2% для гривны, 10% для шекелей. А для долларов выбрасывает ошибку.
 * Протестируйте.
 *
 */

fun theme3() {
    println("\n\n ----Theme 3----")
    val exchanger = Exchanger()
    val dollars = exchanger.exchangeToDollars(1000f, Currency.EURO)
    println("1000 euros became $dollars dollars")
    println("500 grivnas became ${exchanger.exchangeToDollars(500f, Currency.GRIVNA)} dollars")
    println("half of shekel became ${exchanger.exchangeToDollars(0.5f, Currency.SHEKEL)} dollars")
}

/**
 * Тема 6
 * Создать класс ExchangerUtil c методом exchangeToDollars как в классе Exchanger. Однако тут метод должен вызывать
 * без создания экземпляра класса:
 * ExchangerUtil.exchangeToDollars(...)
 */

fun theme6() {
    println("\n\n ----Theme 6----")
    val dollars = ExchangerUtil.exchangeToDollars(1000f, Currency.EURO)
    println("1000 euros became $dollars dollars")
}

/**
 * Тема 7
 * Создать 2 функции расширения для String.
 * Первая: withoutSpaces() возвращающая стрингу без пробелов.
 * Вторая: isHttps - функция возвращает true если стринга начинается с "https:" и содержит хотя бы 1 точку. Пробелы игнорируются.
 *
 *  "https:google" ---> false
 *  "https:google.com" ---> true
 *  "      https://kek.com" ---> true
 */

fun theme7() {
    println("\n\n ----Theme 7----")
    var text = "https:google"
    println("$text ----> ${text.isHttp()}")

    text = "https:google.com"
    println("$text ----> ${text.isHttp()}")

    text = "      https://kek.com"
    println("$text ----> ${text.isHttp()}")
}
