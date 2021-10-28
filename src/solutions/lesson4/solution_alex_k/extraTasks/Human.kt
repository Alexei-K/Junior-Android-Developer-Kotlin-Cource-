package solutions.lesson4.solution_alex_k.extraTasks

class Human(val name: String, var pet: Pet) {
    fun getInfoAboutPet(): String {
        return "Меня зовут $name, а это мой питомец $name"
    }
}