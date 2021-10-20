package com.kolis.test_catalog_app.studying.lesson5.solution

open class Human(open val name: String, open val age: Int) {
    open fun getInfo() {
        println("My class is ${Human::class.java.simpleName}, my name is $name. I am $age years old")
    }

    override fun toString(): String {
        return name
    }
}