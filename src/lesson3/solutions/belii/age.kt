import java.util.*
fun main() {
    println("Введите год рождения:")
    val line = readLine()?.toInt()
    println("Введен год - $line")
    val z = line?.let { isMature(it) }
    if (z == true)
        println("Человек совершеннолетний.")
    else
        println("Человек несовершеннолетний.")
}
fun isMature(line: Int): Boolean {

    val c = Calendar.getInstance()
    val year = c.get(Calendar.YEAR)
    println("Текущий год - $year")
    val x = year - line

    return x >= 18
}
