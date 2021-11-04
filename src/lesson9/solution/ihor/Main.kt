package lesson9.solution.ihor

import lesson7.solution.ihor.task1.FootballerModel
import lesson9.solution.ihor.Dress
import lesson9.solution.ihor.Wardrobe

fun main() {
    val players = mutableSetOf(
        FootballerModel(
            "Ihor", 19, 100.0, 7.0, "PolskieLoxi"
        ),
        FootballerModel(
            "Alexei", 27, 1000.0, 10.0, "TeamMentor"
        ),
        FootballerModel(
            "Ihor Harkavyi", 19, 576.0, 0.0, "Natus Vincere"
        )
    )
    val team = FootballTeam("Junior Android Devs", players)
    team.hireFootballer(FootballerModel("Lionel", 35, 16.0, 10.0, "PSG"))
    team.fireFootballer(FootballerModel("Lionel", 35, 16.0, 10.0, "PSG"))
    team.fireFootballerWithName("Alexei")

    val wardrobe = Wardrobe()
    wardrobe.allClothes = mutableListOf(
        Dress("T-Shirt", 50, "Black"),
        Dress("Hoodie", 51, "Yellow"),
        Dress("Pants", 34, "Dark Green"),
        Dress("Boots", 43, "Black"),
        Dress("Underpants", 33, "Pink")
    )
    wardrobe.putDress(
        Dress("Hat", 15, "Black")
    )
    wardrobe.removeDress(
        Dress("Pants", 34, "Dark Green")
    )
    wardrobe.removeDress(
        Dress("Underpants", 33, "Pink")
    )
    println(";) he-he")
    wardrobe.findAllDressWithColor("Yellow")

    val archive = SecretArchive()
    archive.mapUpdater("+0092212", Person("Кирилл", "Катанов", 21))
    archive.mapUpdater("77777", Person("Владимир", "Зеленский", 33))
    archive.mapUpdater("12211", Person("Владимир", "Зеленский", 33))
    archive.mapUpdater("31132", Person("Никита", "Фирков", 19))
    archive.mapUpdater("+0921112", Person("Алина", "Перешеевская", 23))
    archive.mapUpdater("+11211", Person("Никита", "Фирков", 19))
    archive.mapUpdater("+121112", Person("Вася", "Пупкин", 44))
    archive.mapUpdater("7777799", Person("Нина", "Вывертов", 23))
    archive.mapUpdater("+1299932", Person("Андрей", "Казавчинский", 21))
    archive.mapUpdater("+12121211", Person("Алексей", "Колисниченко", 26))
    println(archive.deletePhoneAndAssociated("77777"))

}

