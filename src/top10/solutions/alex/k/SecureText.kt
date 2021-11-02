package top10.solutions.alex.k

import java.lang.Exception

class SecureText(private val password: String, private val text: String) {
    fun getTextByPassword(_password: String): String {
        if (_password == password) {
            return text
        } else {
            throw Exception("Wrong password!")
        }
    }
}