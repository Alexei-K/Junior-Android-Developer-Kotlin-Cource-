package lesson11.solution.ihor.task4

fun task4() {
    val lambda4: (String, Int) -> String = { string, num ->
        var textToPrint = ""
        for (index in 1..num) {
            textToPrint += "\n$string"
        }

        textToPrint
    }

    println(lambda4("haha", 3))

}