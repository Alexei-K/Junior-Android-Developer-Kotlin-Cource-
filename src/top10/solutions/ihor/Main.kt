package top10.solutions.ihor

fun main() {
    val secureText = SecureText()
    secureText.getTextByPassword(18)

    val exchanger = Exchanger()
    println(exchanger.exchangeToDollars(1000, Currency.HRYVNA))

    println(ExchangerUtil.exchangeToDollars(1000, Currency.HRYVNA))

    val string = "H e l l o W o r l d"
    println(string.withoutSpaces())
    val string2 = "      https://kek.com"
    println(string2.isHttps())

}