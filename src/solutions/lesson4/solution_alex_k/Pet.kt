package com.kolis.test_catalog_app.studying.lesson4.solution

class Pet(val type: String, val name: String, val height: Int, var isFriendly: Boolean) {
    fun greet() {
        if (isFriendly) {
            println("My name is $name")
        }
    }

    fun feed() {
        isFriendly = true
    }

    fun getInfo() {
        val friendlyText = if (isFriendly) {
            "I am friendly"
        } else {
            "I am not friendly"
        }
        println("I am $type, $height cm height and $friendlyText")
    }
}