package top10.solutions.alex.k

enum class Currency(val _name: String, val rateToDollar: Double) {
    DOLLAR("Доллар", 1.0),
    EURO("Евро", 0.91),
    SHEKEL("Шекель", 3.2),
    GRIVNA("Гривна", 26.03)
}