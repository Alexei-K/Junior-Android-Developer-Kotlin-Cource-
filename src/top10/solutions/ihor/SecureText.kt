package top10.solutions.ihor

import java.lang.Exception

class SecureText {
    private val text = "Nudes"
    private val pass = 18
    fun getTextByPassword(password: Int):String {
        if (password == pass) {
            println("Right password")
            return text
        } else {
            throw Exception("Wrong pass")
        }

    }
}