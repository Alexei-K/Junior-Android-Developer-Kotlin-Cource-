package top10.solutions.ihor

import java.lang.Exception

class ExchangerUtil {
    companion object {
        fun exchangeToDollars(sum: Int, currency: Currency): Double {
            val commission = when (currency) {
                Currency.EURO -> {
                    0.01
                }
                Currency.HRYVNA -> {
                    0.02
                }
                Currency.SHEKEL -> {
                    0.1
                }
                Currency.DOLLAR -> {
                    throw Exception("Wrong currency")
                }
            }
            return (sum / currency.rateToDollar) - (sum / currency.rateToDollar) * commission


        }
    }
}