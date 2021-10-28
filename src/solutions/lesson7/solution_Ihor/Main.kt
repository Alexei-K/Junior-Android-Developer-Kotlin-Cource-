package solutions.lesson7.solution_Ihor

import solutions.lesson6.solution_ihor.task1.Tesla
import solutions.lesson7.solution_Ihor.task1.Footballer
import solutions.lesson7.solution_Ihor.task1.FootballerModel
import solutions.lesson7.solution_Ihor.task2.ModernSocket
import solutions.lesson7.solution_Ihor.task3.UniversalSocket

fun main() {
    val f = Footballer("Ihor", 19, 100.0, 50.0, "PolksieLoxi")
    var fm = FootballerModel("Lexa", 27, 100.0, 50.0, "TeamMentor")
    println(f)
    println(fm)

    fm = fm.copy(wins = 200.0)
    println(fm)

    val modernSocket = ModernSocket(5f)
    val teslaFirst = Tesla()
    val teslaSecond = Tesla()
    val teslaThird = Tesla()
    val teslaFourth = Tesla()
    modernSocket.chargeDevice(teslaFirst, teslaSecond)
    modernSocket.chargeDevice(teslaThird, 1f)
    modernSocket.chargeDevice(teslaFourth)

    val universalSocket = UniversalSocket(15f)
    val tesla1 = Tesla()
    val tesla2 = Tesla()
    universalSocket.charge(tesla1)
    universalSocket.charge(tesla1, 0.8f)
    universalSocket.charge(tesla1, 0.8f, tesla2)
    universalSocket.charge(tesla1, device2 = tesla2)


}