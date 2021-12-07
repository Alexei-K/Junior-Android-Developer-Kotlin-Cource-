package top10.solutions.anastasiya

class SecureText(private val secretText: String, private val password: String) {
    fun getTextByPassword(getPassword: String): String {
        if (getPassword == password) {
            return secretText
        } else {
            throw Exception("You entered an incorrect password!")
        }
    }
}

