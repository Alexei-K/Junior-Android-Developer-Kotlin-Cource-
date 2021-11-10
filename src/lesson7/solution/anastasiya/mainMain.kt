package lesson7.solution.anastasiya

import lesson5.solutions.anastasiya.Footballer
import lesson6.solution.anastasiya.task1.Tesla
import lesson7.solution.anastasiya.task1.FootballerModel
import lesson7.solution.anastasiya.task2.ModernSocket
import lesson7.solution.anastasiya.task3.UniversalSocket

fun task1() {
    val footballer1 = Footballer("Bobo", 25, 84, 16, "Mexikango")
    val footballerModel2 = FootballerModel("Jojo", 36, 58, 42, "Koyoters")
    println(footballer1)
    println(footballerModel2)
    val footballerModel = footballerModel2.copy(wins = 67, looses = 33)
    println(footballerModel)
}

fun task2() {
    val socket = ModernSocket(60f)
    val device1 = Tesla()
    val device2 = Tesla()
    val device3 = Tesla()
    val device4 = Tesla()
    socket.chargeDevise(device1, device2)
    socket.chargeDevise(device3, 0.1f)
    socket.chargeDevice(device4)
}

fun main() {
    val universalSocket = UniversalSocket(15f)
    val tesla1 = Tesla()
    val tesla2 = Tesla()
    universalSocket.charge(tesla1)
    universalSocket.charge(tesla1, 0.8f)
    universalSocket.charge(tesla1, 0.8f, tesla2)
    universalSocket.charge(tesla1, secondDevice = tesla2)
}