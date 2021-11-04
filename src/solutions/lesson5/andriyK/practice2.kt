package solutions.lesson5.andriyK

fun main() {
    val people = arrayOf(
        Footballer(name = "donait", age = 18, wins = 4, looses = 6, teamName = "Chernomorez"),
        Footballer(name = "GG", age = 20, wins = 6, looses = 2, teamName = "Porno"),
        Human(name = "Lol", age = 34),
        Human(name = "fog", age = 50)
    )
    for (person in people){
        person.getInfo()
        if (person is Footballer){
           person.playFootball()
        }
        println("$person")
    }


}