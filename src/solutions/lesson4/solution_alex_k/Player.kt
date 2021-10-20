package solutions.lesson4.solution_alex_k

class Player(
    val model: String,
    private val supportedFileExtensions: Array<String>
) {

    private var isTurnedOn: Boolean = false

    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    fun play(track: MusicalTrack) {
        if (!isTurnedOn) {
            println("Включите плеер")
            return
        }
        if (!supportedFileExtensions.contains(track.fileExtension)) {
            println("Плеер не поддерживает данный тип файлов")
            return
        }
        println("А сейчас играет песня ${track.name}: \n ${track.text}")
    }
}