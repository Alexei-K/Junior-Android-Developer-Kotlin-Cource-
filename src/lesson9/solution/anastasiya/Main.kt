package lesson9.solution.anastasiya

import lesson7.solution.anastasiya.task1.FootballerModel

fun main() {
//    task1()
//    task2()
    task3()
}

fun task1() {
    val firstTeam = FootballTeam(
        "Sparta", mutableSetOf(
            FootballerModel("Bill", 20, 60, 40, "Sparta"),
            FootballerModel("Bill", 20, 60, 40, "Sparta"),
            FootballerModel("Add", 24, 70, 30, "Sparta"),
            FootballerModel("Fred", 30, 50, 50, "Sparta")
        )
    )
    println(firstTeam)
    firstTeam.hireFootballer(FootballerModel("Gari", 29, 70, 30, "Sparta"))
    println(firstTeam)
    firstTeam.fireFootballer(FootballerModel("Bill", 20, 60, 40, "Sparta"))
    println(firstTeam)
    firstTeam.fireFootballerWithName("Add")
    println(firstTeam)
}

fun task2() {
    val garderob = Wardrobe(mutableListOf(Dress("rad", 25, "littleDrass"), Dress("black", 23, "lovely")))
    println(garderob)
    garderob.putDress(Dress("blue", 13, "long"))
    println(garderob)
    garderob.removeDress(Dress("rad", 25, "littleDrass"))
    println(garderob)
    println(garderob.findAllDressWithColor("blue"))
}

fun task3(){
    val secretArchive = SecretArchive()
    secretArchive.addPerson("+0092212", Person("Кирилл", "Катанов", 21))
    secretArchive.addPerson("77777", Person("Владимир", "Зеленский", 33))
    secretArchive.addPerson("12211", Person("Владимир", "Зеленский", 33))
    secretArchive.addPerson("31132", Person("Никита", "Фирков", 19))
    secretArchive.addPerson("+0921112", Person("Алина", "Перешеевская", 23))
    secretArchive.addPerson("+11211", Person("Никита", "Фирков", 19))
    secretArchive.addPerson("+121112", Person("Вася", "Пупкин", 44))
    secretArchive.addPerson("7777799", Person("Нина", "Вывертов", 23))
    secretArchive.addPerson("+1299932", Person("Андрей", "Казавчинский", 21))
    secretArchive.addPerson("+12121211", Person("Алексей", "Колисниченко", 26))
    println("Номера в базе: \n ${secretArchive.baseOfNumbers}")
    secretArchive.deleteNumber("+0092212")
    println("После удаления +0092212: \n ${secretArchive.baseOfNumbers}")
    val numOfdeletedNumbers = secretArchive.deletePhoneAndAssociated("77777") - 1
    println("Удалили номер 77777 и еще $numOfdeletedNumbers номеров пользователя")
    println("После удаления база: \n ${secretArchive.baseOfNumbers}")
}