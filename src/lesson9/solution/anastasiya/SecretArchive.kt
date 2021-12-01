package lesson9.solution.anastasiya

class SecretArchive() {
    var baseOfNumbers: MutableMap<String, Person> = mutableMapOf()
    fun addPerson(newNomber: String, whoNew: Person) {
        baseOfNumbers[newNomber] = whoNew
    }

    fun changePerson(numberPerson: String, newPerson: Person) {
        baseOfNumbers[numberPerson] = newPerson
    }

    fun deleteNumber(numberPerson: String) {
        baseOfNumbers.remove(numberPerson)
    }

    fun deletePhoneAndAssociated(numberPerson: String): Int {
//        val personNumbersToDelete: MutableList<String> = mutableListOf()
        val whoPerson = baseOfNumbers[numberPerson]
//        for (pair in baseOfNumbers) {
//            if (pair.value == whoPerson) {
//                personNumbersToDelete.add(pair.key)
//            }
//        }
//        val howManyNumbers = personNumbersToDelete.size
//        for (number in personNumbersToDelete) {
//            baseOfNumbers.remove(number)
//        }
//        return howManyNumbers
        val personNumbersToDelete = baseOfNumbers.filter {
            it.value == whoPerson
        }
        for (number in personNumbersToDelete) {
            baseOfNumbers.remove(number.key)
        }
            return personNumbersToDelete.size
        }
    }