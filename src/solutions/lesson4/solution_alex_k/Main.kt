package com.kolis.test_catalog_app.studying.lesson4.solution

/**
 * УРОК 4
 */

/**
 * Задача 1
 * Создать класс Pet с параметрами type:String(ex."Dog"),name:String(ex."Bobik"), height:Int, isFriendly:Boolean
 * c методом greet(), который выводит в консоль в консоль "Меня зовут \имя" если животное дружелюбное
 * c методом info(), который выводит в консоль вcю информацию о животном, кроме имени
 * с метод feed(), который меняет isFriendly на true.
 * Создать 3 животных и протестировать методы
 */

fun main1() {
    val bobik = Pet("dog", "bobik", 100, true)
    val kisa = Pet("cat", "kisa", 130, false)
    bobik.greet()
    bobik.getInfo()
    kisa.greet()
    kisa.getInfo()
}

/**
 * Задача 2
 * Создать класс SecretLetter с 1 переменной text.
 * Переопределить сеттер и геттер у переменной text так,
 * чтобы они выводили в консоль что кто то меняет значение перемнной или пыается поулчить к ней доступ
 *
 * Протестировать класс создав экземпляр класса, записать туда секретный текст и пропробовать вывести его в консоль
 */
fun main2() {
    val counter = SecretLetter()
    counter.text = "Super secret text"
    val value = counter.text
    println("text in secret letter was: $value")
}

/**
 * Задача 3**
 * Создать класс MusicalTrack с параметрами fileExtension:String, name, text, lengthSeconds:Int
 * Создать класс Player c параметрами model:String, isTurnedOn:Boolean (при создании плеера он всегда должен быть выключен)
 * и supportedFileExtensions:Array<String> (список расширений файлов, поддерживаемых плеером, например [".mp3",".wav"]
 * В классе Player должен быть метод turnOn() turnOff().
 *      В классе Player должен быть метод play, который принимает MusicalTrack и выводит в консоль:
 *      Если плэйер выключен - "Включите плеер"
 *      Если в supportedFileExtensions не содержит fileExtension трэка - "Плеер не поддерживает данный тип файлов"
 *      Если плейер включен и поддерживает данный тип файла - выводит в консоль название песни и её текст.
 *
 *      Создать 2 плейера и 4 трека и протестировать логику работы (включить, проиграть трек, выключить и пр).
 */
fun main3() {
    val audioPlayer = Player("audio", arrayOf(".mp3", ".wav", ".sse"))
    val videoPlayer = Player("video", arrayOf(".mp4", ".mkv", ".flv"))
    val track1 = MusicalTrack(".mp3", "Helelluia", "It was like this the 4-th, the 5-th", 120)
    audioPlayer.play(track1)
    audioPlayer.turnOn()
    audioPlayer.play(track1)
    audioPlayer.turnOff()
    audioPlayer.play(track1)
    videoPlayer.play(track1)

}





