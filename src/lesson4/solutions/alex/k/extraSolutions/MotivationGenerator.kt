package lesson4.solutions.alex.k.extraSolutions

class MotivationGenerator {
    private var phrases = arrayOf(
        "Твоя неприятность/болезнь — это всего лишь одна глава жизни, но не вся история.",
        "Ты архитектор своей жизни. Ты сам/сама закладываешь фундамент и выбираешь фактуру и наполнение.",
        "Твоя неприятность/болезнь — это всего лишь одна глава жизни, но не вся история.Твой тяжелый труд, любящее и щедрое сердце наполняют меня благодарностью."
    )

    fun getMotivatingPhrase(): String {
        return phrases.random()
    }
}