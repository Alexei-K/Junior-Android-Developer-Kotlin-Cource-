package lesson4.solutions.anastasiya.extraSolutions

class Love(var manName: String, var womenName: String, var manAge: Int, var womenAge: Int) {
    fun compatibilityName() {
        if (manName[0] == womenName[0]) {
            println("Your compatibility is above 70%")
        } else {
            println("Your compatibility is below 50%")
        }
    }

    fun compatibilityAge() {
        var difference = manAge - womenAge
        if (difference < 0) {
            difference *= -1
        }
        if (difference <= 5) {
            println("perfect couple")
        } else if (difference in 6..9) {
            println("good couple")
        } else {
            println("not compatible")
        }
    }
}
