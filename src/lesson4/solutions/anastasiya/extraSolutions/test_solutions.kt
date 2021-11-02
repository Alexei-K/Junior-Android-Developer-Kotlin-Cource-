package lesson4.solutions.anastasiya.extraSolutions

fun main() {
    task1()
    task2()
    task3()
    task4()
    task5()

}
fun task1 () {
    val xiaomi = Phone(32, 13, "0688069713", "Xiaomi Redmi Note 9 Pro")
    println(xiaomi.getInfo())
    xiaomi.memoryUsed = 15
    xiaomi.phoneNumber = "380688069713"
    println(xiaomi.getInfo())
}

fun task2() {
    Logger("Happy")
}

fun task3() {
    val hello = Barmen(25,"Denis")
    println(hello.greet())
}

fun task4() {
    val firstPair = Love("Stas","Lera", 10,90)
    firstPair.compatibilityName()
    firstPair.compatibilityAge()
}

fun task5() {
    val experients = Motivation("Лёша", 28, 4)
    experients.dontBeSad()
    experients.wordsOfSupport()
}
