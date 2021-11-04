package lesson9.solution.ihor

class SecretArchive {
    var archive = mutableMapOf<String, Person>()
    fun mapUpdater(number: String, person: Person) {
        archive.put(number, person)
    }

    fun deleteNumber(number: String) {
        archive.remove(number)
    }

    fun deletePhoneAndAssociated(number: String): Int {
        val phoneOwner = archive[number]
        val newArchive: MutableMap<String, Person> = archive.filter { it.value != phoneOwner }.toMutableMap()
        val size = archive.size
        archive = newArchive
        return size - newArchive.size


    }


}