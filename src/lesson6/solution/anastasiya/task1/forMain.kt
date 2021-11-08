package lesson6.solution.anastasiya.task1

fun main() {
    val weakCharge = ElectroSocket(4f)
    val device1 = IPhone()
    weakCharge.chargeDevice(device1)
    val strongCharge = ElectroSocket(12f)
    val device2 = Tesla()
    strongCharge.chargeDevice(device2)
}