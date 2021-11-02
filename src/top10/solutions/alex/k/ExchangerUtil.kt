package top10.solutions.alex.k

import java.lang.Exception

class ExchangerUtil {
    companion object {
        fun exchangeToDollars(amount: Float, currency: Currency): Float {
            val commission = when (currency) {
                Currency.DOLLAR -> {
                    throw Exception("Can't exchange dollar to dollar")
                }
                Currency.EURO -> {
                    0.01
                }
                Currency.SHEKEL -> {
                    0.1
                }
                Currency.GRIVNA -> {
                    0.02
                }
            }
            val dollarsBeforeCommission = amount / currency.rateToDollar
            return (dollarsBeforeCommission * (1 - commission)).toFloat()
        }
    }
}