package lesson6.solution.ihor.task2


fun decodeWebError(error: Int) {
    when {
        (error < 100 || error > 600) -> println("Not valid code")
        (error / 100 == 2) -> println("Ok")
        (error == 404) -> println("Web site not found")
        (error / 100 == 4) -> println("Unknown error $error")

        else -> println("The code $error is valid, but unknown. Check it here:https://siterost.net/post/http-status-codes")


    }


}
