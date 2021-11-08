package lesson6.solution.anastasiya.task3

fun main() {
    val firstForest = Forest(
        "FIRST",
        arrayOf(
            Oak("Oak1"),
            Oak("Oak2"),
            AppleTree("Apple1"),
            AppleTree("Apple2"),
            Walnut("Walnut1"),
            Walnut("Walnut2")
        )
    )
    val twoForest = Forest(
        "TWO",
        arrayOf(
            Oak("Oak11"),
            Oak("Oak22"),
            AppleTree("Apple11"),
            AppleTree("Apple22"),
            Walnut("Walnut11"),
            Walnut("Walnut22")
        )
    )
    while (firstForest.forestAlive() && twoForest.forestAlive()) {
        val someYears = (10..20).random()
        firstForest.someYearsPassed(someYears)
        twoForest.someYearsPassed(someYears)
    }
    if (firstForest.forestAlive()) {
        println("Forest ${firstForest.name} is alive. Trees:\n ${firstForest.getAliveTrees()}")
    } else if (twoForest.forestAlive()) {
        println("Forest ${twoForest.name} is alive. Trees:\n ${twoForest.getAliveTrees()}")
    } else if (!firstForest.forestAlive() && !twoForest.forestAlive()) {
        println("Not a single forest has survived")
    }
}