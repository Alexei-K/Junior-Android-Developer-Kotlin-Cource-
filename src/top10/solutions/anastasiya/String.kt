package top10.solutions.anastasiya

fun String.withoutSpaces(): String {
    return this.replace(" ", "")
}

fun String.isHttps(): Boolean {
    val needString = this.withoutSpaces()
    return (needString.startsWith("https:") && needString.contains('.'))
}