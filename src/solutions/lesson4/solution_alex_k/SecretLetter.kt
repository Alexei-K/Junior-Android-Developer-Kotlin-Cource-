package com.kolis.test_catalog_app.studying.lesson4.solution

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