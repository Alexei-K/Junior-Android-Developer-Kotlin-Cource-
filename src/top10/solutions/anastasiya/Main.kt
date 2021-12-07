package top10.solutions.anastasiya

import kotlin.math.E

fun main() {
//    task1()
//    task2()
//    task3()
    task4()
}

fun task1() {
    val secretMyHurt = SecureText("I love Alex K.", "burritos")
    print(secretMyHurt.getTextByPassword("burrito"))
}

fun task2() {
    val exchange = Exchanger()
    println(exchange.exchangeToDollars(200.00, Currency.Euro))
    println(exchange.exchangeToDollars(200.00, Currency.Hryvnia))
    println(exchange.exchangeToDollars(200.00, Currency.Shekel))
    println(exchange.exchangeToDollars(200.00, Currency.Dollar))
}

fun task3() {
    println(ExchangerUtil.exchangeToDollars(100.00, Currency.Euro))
    println(ExchangerUtil.exchangeToDollars(100.00, Currency.Hryvnia))
    println(ExchangerUtil.exchangeToDollars(100.00, Currency.Shekel))
    println(ExchangerUtil.exchangeToDollars(100.00, Currency.Dollar))
}

fun task4() {
    val cat = "I love my cat."
    println(cat.withoutSpaces())
    val first = "https:google"
    val second = "https:google.com"
    val third = "      https://kek.com"
    println(first.isHttps())
    println(second.isHttps())
    println(third.isHttps())
}