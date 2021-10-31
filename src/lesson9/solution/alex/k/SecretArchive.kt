package lesson9.solution.alex.k

// Используется MutableMap потому что есть уникальный ключ (телефон)
// и связанное с ним неуникальное значение (человек)

class SecretArchive {
    private var secretInfo = mutableMapOf<String, Person>()

    //Возвращает базу телефонов которую нельзя изменить.
    fun getSecretInfo(): Map<String, Person> {
        return secretInfo.toMap()
    }

    fun addPhone(phone: String, person: Person) {
        secretInfo[phone] = person
    }

    fun changePhoneOwner(phone: String, person: Person) {
        secretInfo[phone] = person
    }

    fun deletePhone(phone: String) {
        secretInfo.remove(phone)
    }

    fun deletePhoneAndAssociated(phone: String): Int {
        val phoneOwner = secretInfo[phone]
        val ownerNumbers = secretInfo.filter { it.value == phoneOwner }
        secretInfo = secretInfo.filter { it.value != phoneOwner }.toMutableMap()
        return ownerNumbers.size
    }
}