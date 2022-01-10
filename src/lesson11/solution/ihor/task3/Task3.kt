package lesson11.solution.ihor.task3

import lesson11.tasks.RedButton

fun task3() {
    val button1 = RedButton()
    button1.setClickListener { println("Button pressed") }
    button1.click()
    button1.setClickListener { println("2nd press") }
    button1.click()
}