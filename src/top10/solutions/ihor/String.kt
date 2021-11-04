package top10.solutions.ihor

fun String.withoutSpaces(): String {
    return this.replace("\\s".toRegex(), "")
}

fun String.isHttps(): Boolean {
    return this.withoutSpaces().startsWith("https:") && this.withoutSpaces().contains('.')
}
