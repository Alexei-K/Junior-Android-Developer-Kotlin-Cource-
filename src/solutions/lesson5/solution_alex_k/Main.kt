package solutions.lesson5.solution_alex_k

/**
 * Глава 5
 */

/**
 * Задача 1
 * Создать класс House, который при инициализации выводит в консоль "House was built"
 * унаследовать от него класс Hospital который при создании выводит в консоль "Hospital was built"
 * создать несколько экземпляров каждого класса
 */
fun main1() {
    House()
    House()
    Hospital()
}


/**
 * Задача 2*
 * Создать класс Human(name,age) с методом getInfo() который выводит имея класса и имя человека
 * От него наследуется класс Footballer( name,age, wins, looses, teamName) с overriden методом getInfo()
 * который выводит имея класса, имя человека, клуб и процент побед. Tak же у этого класса есть метод playFootball()
 * выводящий что то в консоль
 * Создайте массив с 2 людьми и 2 футболистами и попытаться вызовите их методы getInfo и playFootball.
 * Так же вызовите метод toString() и результат выведите в консоль
 * если какой то из методов не вызывается, то закомментировать его и объяснить в комментарии почему
 */
fun main2() {
    val alex = Human("Alex", 22)
    val nick = Human("Nikita", 13)
    val ronaldo = Footballer("Ronaldo", 33, 99, 21, "Barselona")
    val messi = Footballer("Messi", 31, 1000, 1, "Liverpool")
    // тип массива указан только для наглядности
    val people = arrayOf<Human>(alex, nick, ronaldo, messi)
    for (person in people) {
        person.getInfo()
//        Не вызовется, потому что массив содержит переменные класса Human, а у Human нет такого метода
//        person.playFootnall()
    }
}

/**
 * Задача 3
 * Переопределите метод .toString() у класса Human, чтобы он возвращал стрингу С именем человека.
 * Создайте массив с 2 людьми и 2 футболистами
 *  вызовите их метод toString() и результат выведите в консоль.
 *  Так же попробуйте вызвать "$название_переменной"
 */

fun main3() {
    val alex = Human("Alex", 22)
    val nick = Human("Nikita", 13)
    val ronaldo = Footballer("Ronaldo", 33, 99, 21, "Barselona")
    val messi = Footballer("Messi", 31, 1000, 1, "Liverpool")
    // тип массива указан только для наглядности
    val people = arrayOf<Human>(alex, nick, ronaldo, messi)
    for (person in people) {
        println(person.toString())
        println("I am $person")
    }
}

