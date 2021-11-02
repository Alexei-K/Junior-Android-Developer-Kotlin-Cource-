package lesson11.solution.alex.k


/**
 * Урок 11
 * Лямбды, сука, сложные :с
 */

fun main() {
    task1()
    task2()
    task3()
    task4()
}

/**
 * Задача 1.
 * запустить функцию launchWithDelay из класса Delayer с помощью полной и сокращенной записи.
 * В качестве лямбды можете передать любой вывод в консоль информации.
 */

fun task1() {
    println("\n----Task 1=----")
    val delayer = Delayer()
    val someTask = {
        println("Task is launched")
    }
    println("Task is created")
    delayer.launchWithDelay(1500, someTask)
    delayer.launchWithDelay(2000) {
        println("Second Task is launched")
    }
}

/**
 * Задача 2.
 * Создать копию класса Delayer.
 * Создать тайпалиас MilliSeconds вместо Double
 * и DelayedTask вместо лямбды
 * Создать метод executeTasksWithDelayBetween принимающий 2 лямбды и время которое должно пройти между ними.
 * (используйте тайпалиасы)
 * сам метод запускает первую лямбду, потом делает паузу на указанное кол-во милисекунд и запускает вторую лямбду.
 */

fun task2() {
    println("\n----Task 2=----")
    val someTask = {
        println("Task 1 is launched")
    }
    Delayer().executeTasksWithDelayBetween(3000, someTask) {
        println("Second task is launched")
    }
}


/**
 * Задача 3.
 * Разобраться и протестировать класс RedButton.
 * Создать экземпляры кнопки, изменить их листенеры и покликать на кнопку.
 */

fun task3() {
    println("\n----Task 3=----")
    val button1 = RedButton()
    button1.setClickListener {
        println("кнопка 1 нажата")
    }
    println("сейчас на кнопку 1 нажмут")
    button1.click()
    println("меняем листенер")
    button1.setClickListener {
        println("ALERT ALERT!!!")
    }
    println("сейчас на кнопку 1 снова нажмут")
    button1.click()
}

/**
 * Задача 4*.
 * Создайте лямбду, которая принимает текст и инт,
 * а возвращает String, с текстом повторённым с новой строки столько раз, сколько сказано в инте.
 * Запустите эту лямбду и выведите результат в консоль
 */

fun task4() {
    println("\n----Task 4=----")

    val lambda: (String, Int) -> String = { text, number ->
        var resultText = ""
        for (index in 1..number) {
            resultText += "\n$text"
        }
        resultText
    }


    println(lambda("I HATE LAMBDAs", 5))
    println(lambda("I like pizza", 2))
}



