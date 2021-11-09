package lesson5.solutions.belii

fun main() {
    task11()
    task12()
    task13()
}
/**
 * Глава 5
 */

/**
 * Задача 1
 * Создать класс House, который при инициализации выводит в консоль "House was built"
 * унаследовать от него класс Hospital который при создании выводит в консоль "Hospital was built"
 * создать несколько экземпляров каждого класса
 */

fun task11() {

    val build = House ()
    val building = Hospital()
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
fun task12() {
    val vasja = Human("Вася", 18)
    val vasja2 = Human("Вася2", 19)
    val kolja = Footballer("Коля", 20, 15.0, 10.0, "Ливерпуль")
    val kolja2 = Footballer("Коля2", 21, 16.0, 11.0, "Манчестер")
    val arrayofMens = arrayOf(vasja, vasja2, kolja, kolja2)
    for (man in arrayofMens){
        man.getInfo()
        (man as? Footballer)?.playFootball()
    }

    println(vasja.toString())
    kolja.getInfo()
    kolja.playFootball()
}





/**
 * Задача 3
 * Переопределите метод .toString() у класса Human, чтобы он возвращал стрингу С именем человека.
 * Создайте массив с 2 людьми и 2 футболистами
 *  вызовите их метод toString() и результат выведите в консоль.
 *  Так же попробуйте вызвать "$название_переменной"
 */

fun task13() {
    val vasja = Human1("Вася", 18)
    val vasja2 = Human1("Вася2", 19)
    val kolja = Footballer1("Коля", 20, 15.0, 10.0, "Ливерпуль")
    val kolja2 = Footballer1("Коля2", 21, 16.0, 11.0, "Манчестер")
    val arrayofMens = arrayOf(vasja, vasja2, kolja, kolja2)
    vasja.getInfo()
    kolja.getInfo()
    kolja.playFootball()
    arrayofMens[0].getInfo().toString()
    arrayofMens[1].getInfo().toString()
    arrayofMens[2].getInfo().toString()
    arrayofMens[3].getInfo().toString()
    arrayofMens[0].toString()
    arrayofMens[1].toString()
    arrayofMens[2].toString()
    arrayofMens[3].toString()
//Footballer::class.memberProperties.map {
//    val variableName = it.name
//        println("$$variableName")
//    }
    println("$vasja маладэц")
}

open class Human1(open val name: String, open val age: Int) {
    open fun getInfo() {
        val className = Human::class.java.simpleName
        val humanName = name
        println("$className: $humanName")
    }
    override fun toString(): String {
        return name
    }
}
class Footballer1(override val name: String, override val age: Int, val wins: Double, val looses: Double, val teamName: String):
    Human1(name, age){
    override fun getInfo(){
        val persentWins = wins/(wins+looses)*100
        val className = Human::class.java.simpleName
        val humanName = name
        val comandName = teamName
        println("$className: $humanName; $persentWins; $comandName")
    }
    fun playFootball(){
        println("Спартак чемпион!")
    }
    override fun toString(): String {
        return name
    }
}

