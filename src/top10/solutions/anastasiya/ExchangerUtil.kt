package top10.solutions.anastasiya

object ExchangerUtil {
    fun exchangeToDollars (sum: Double, currency: Currency): Double {
        val amountInDollars = currency.rateToDollar * sum
        return when (currency) {
            Currency.Euro -> amountInDollars - (amountInDollars * 0.01)
            Currency.Hryvnia -> amountInDollars - (amountInDollars * 0.02)
            Currency.Shekel -> amountInDollars - (amountInDollars * 0.10)
            Currency.Dollar -> throw Exception ("You cannot convert dollar to dollar!")
        }
    }
}