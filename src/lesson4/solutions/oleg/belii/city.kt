fun main() {

    println("Введите название города:")
    val city = readLine()
    println("Введите площадь дома:")
    val area = readLine()?.toFloat()
    println("Введите итоговую цену дома:")
    val price = readLine()?.toInt()
    println("Город - $city, площадь дома - $area, итоговая цена дома - $price")
    shouldBuyHouse(city!!, area!!, price!!)

}
fun shouldBuyHouse (city: String, area: Float, price: Int) {
    val city1 = ("Одесса")
    val city2 = ("Киев")
    val cityPrice = price / area
    return if (city == city1 && cityPrice < 1000 || city == city2 && cityPrice < 1000)
        println("Покупай скорее.")
    else
        println("Не интересует.")
    }
