package lesson4.solutions.alex.k.tasks

class SecretLetter {
    var text = ""
        set(value) {
            println("Someone changed secret text to = $value")
            field = value
        }
        get() {
            println("Someone is reading secret text: $field")
            return field
        }
}