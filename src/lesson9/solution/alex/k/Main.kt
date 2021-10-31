package lesson9.solution.alex.k

import lesson7.solution.alex.k.task1.FootballerModel


/**
 * Урок 9
 * В реальной работе вам понадобится умение находить подходящие инструменты среди существующих.
 * List, Map, Set - это котлиновские коллекции, которые имеют огромное количество методов на все случаи жизни.
 * Многие из них используют лямбда выражения, которые вы изучите в 11-12 главах.
 * В выполнении этого задания вам сильно поможет .filter{}
 * Вы можете сами придумать механизмы, для решения задач или найти в гугле этот метод и изучить.
 */

/**
 * Задача 1.
 * Создать класс FootballTeam с названием и коллекцией содержащей FootballerModel из 7 главы 1 задачи.
 * добавить метод hireFootballer добавляющий  футболиста в команду.
 * добавить метод fireFootballer удаляющий футболиста (принимает FootballerModel)
 * Доп задание на 1 звездочку: добавить метод fireFootballerWithName удаляющий футболиста по имени (принимает стрингу)
 * Написать какой тип коллекций (set/list/map) вы выбрали и почему
 * потестировать методы hireFootballer, fireFootballer . После каждого вызова метода выводить состав команды в консоль
 */
fun main() {
    task1()
    println("\n\n")
    task2()
    println("\n\n")
    task3()
}

fun task1() {
    val players = mutableSetOf(
        FootballerModel("Ronaldo", 33, 100, 4, "Sherif"),
        FootballerModel("Messi", 35, 4, 0, "Manchester"),
        FootballerModel("Ronaldo", 33, 100, 4, "Sherif")
    )
    val dreamTeam = FootballTeam("DreamTeam", players)
    println("изначальная команда: \n$dreamTeam")
    dreamTeam.hireFootballer(FootballerModel("Koshkin", 22, 11, 12, "Chelsi"))
    println("команда c кошкиным : \n$dreamTeam")
    dreamTeam.hireFootballer(FootballerModel("Koshkin", 22, 11, 12, "Chelsi"))
    println("попытались еще раз нанять кошкина: \n$dreamTeam")
    dreamTeam.fireFootballer(FootballerModel("Koshkin", 22, 11, 12, "Chelsi"))
    println("уволили кошкина: \n$dreamTeam")
    dreamTeam.fireFootballerWithName("Ronaldo")
    println("уволили роналдо: \n$dreamTeam")
}


/**
 * Задача 2.
 * Создать дата класс Dress(одежда) с параметрами цвет, размер, название.
 * и класс Wardrobe (гардероб) c методами putDress, removeDress и методом findAllDressWithColor принимающий стрингу означающую
 * цвет и возвращающую коллекцию Dress указанного цвета которые есть в шкафу
 *
 * какой тип коллекции будет использован в Wardrode?
 */
fun task2() {
    val wardrobe = Wardrobe()
    wardrobe.putDress(Dress("носки", 39, "желтый"))
    wardrobe.putDress(Dress("майка", 21, "красный"))
    wardrobe.putDress(Dress("рубашка", 3, "синий"))
    wardrobe.putDress(Dress("рубашка", 3, "красный"))
    println("Вещи в шкафу: \n ${wardrobe.dressList}")
    wardrobe.removeDress(Dress("рубашка", 3, "синий"))
    println("Вещи красного цвета: \n ${wardrobe.findAllDressWithColor("красный")}")

}


/**
 * Задача 3*
 * сделать класс SecretArchive
 * содержащую коллекцию номеров телефона(стринг) и их владельцев(класс Person с переменными name, surname, age).
 * У человека может быть много телефонов. У телефона всегда 1 владелец.
 * Добавить методы добавления нового телефона и его владельца, изменения владельца существующего телефона,
 * deleteNumber() - удаление номер телефона из базы
 * Доп задание на на Две звезды: deletePhoneAndAssociated() - метод принимающий номер телефона и удаляющий его из базы и все
 * телефоны этого же владельца. Возвращает количество удаленных номеров
 */

fun task3() {
    val secretArchive = SecretArchive()
    secretArchive.addPhone("+0092212", Person("Кирилл", "Катанов", 21))
    secretArchive.addPhone("77777", Person("Владимир", "Зеленский", 33))
    secretArchive.addPhone("12211", Person("Владимир", "Зеленский", 33))
    secretArchive.addPhone("31132", Person("Никита", "Фирков", 19))
    secretArchive.addPhone("+0921112", Person("Алина", "Перешеевская", 23))
    secretArchive.addPhone("+11211", Person("Никита", "Фирков", 19))
    secretArchive.addPhone("+121112", Person("Вася", "Пупкин", 44))
    secretArchive.addPhone("7777799", Person("Нина", "Вывертов", 23))
    secretArchive.addPhone("+1299932", Person("Андрей", "Казавчинский", 21))
    secretArchive.addPhone("+12121211", Person("Алексей", "Колисниченко", 26))
    println("Номера в базе: \n ${secretArchive.getSecretInfo()}")
    secretArchive.deletePhone("+0092212")
    println("После удаления +0092212: \n ${secretArchive.getSecretInfo()}")
    val numOfdeletedNumbers = secretArchive.deletePhoneAndAssociated("77777") - 1
    println("Удалили номер 77777 и еще $numOfdeletedNumbers номеров пользователя")
    println("После удаления база: \n ${secretArchive.getSecretInfo()}")
}

