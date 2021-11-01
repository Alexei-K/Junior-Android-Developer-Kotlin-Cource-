package lesson11.solution.alex.k

class TextDownloader() {
    private val resultslist = mutableListOf("ʕ•́ᴥ•̀ʔっ", "(ง︡'-'︠)ง", "(っ＾▿＾)\uD83D\uDCA8", "Error!")

    fun downloadFromInternet(url: String, onLoadingFinished: (String) -> Unit) {
        println("started downloading from URL: $url")
        //Simulate the internet request delay
        Thread.sleep(1500)
        val downloadResult = resultslist.random()
        onLoadingFinished(downloadResult)
    }

}