package lesson6.solution.anastasiya.task2

fun decodeWebError(error: Int) {
    when {
        error < 100 || error > 600 -> println("Not valid code")
        (error / 100) == 2 -> println("OK")
        error == 404 -> println("Web site not found")
        (error / 100) == 4 -> println("Unknown error: ${error / 100}")
        else -> {
            println(
                "The code $error is valid, but unknown . Check it here : https://siterost.net/post/http-status-codes"
            )
        }
    }
}

fun main() {
    decodeWebError(25)
    decodeWebError(202)
    decodeWebError(404)
    decodeWebError(434)
    decodeWebError(567)
}
