package lesson6.solution.alex.k.task2

fun decodeWebError(code: Int) {
    when {
        (code < 100 || code > 600) -> {
            println("Not valid code: $code")
        }
        (code / 100 == 2) -> {
            println("OK")
        }
        code == 404 -> {
            println("Web site not found")
        }
        code / 100 == 4 -> {
            println("Unknown error: $code")
        }
        else -> {
            println("The code $code is valid, but unknown. \n Check it here:https://siterost.net/post/http-status-codes")
        }
    }
}