package top10.solutions.alex.k


fun String.withoutSpaces(): String {
    return this.replace(" ", "")
}

fun String.isHttp(): Boolean {
    if (!this.contains('.')) return false
    val temporaryString = this.withoutSpaces()
    return temporaryString.startsWith("https:")
}
