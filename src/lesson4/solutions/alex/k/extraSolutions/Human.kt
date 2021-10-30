package lesson4.solutions.alex.k.extraSolutions

class Human(val name: String, var pet: Pet) {
    fun getInfoAboutPet(): String {
        return "Меня зовут $name, а это мой питомец $name"
    }
}