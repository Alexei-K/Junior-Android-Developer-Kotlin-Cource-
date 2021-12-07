package top10.solutions.anastasiya

enum class Currency (val _name: String, val rateToDollar: Double) {
    Euro ("EUR", 1.13),
    Shekel("NIS", 0.32),
    Dollar("USD", 1.00),
    Hryvnia("UAH", 0.037)
}