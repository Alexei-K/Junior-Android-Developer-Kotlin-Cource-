fun main() {
    println("Введите слово:")
    val line = readLine()?.toCharArray()
    val result: String? = line?.joinToString("")
    val z = line?.let { isRevertable(it) }
    if (z == true) {
        println("$result - true.")
    } else {
        println("$result - false.")
    }
}
fun isRevertable(word: CharArray): Boolean {
    if (word.isEmpty()) {
        return false
    } else {
    var i1 = 0
    var i2 = word.size - 1
    while (i2 > i1) {
        if (word[i1].isLowerCase() != word[i2].isLowerCase()) {
            return false
        }
        ++i1
        --i2
    }
    return true
}}