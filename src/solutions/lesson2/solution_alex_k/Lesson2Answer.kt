package solutions.lesson2.solution_alex_k

//Задача 1
//Вывести все элементы массива в консоль в обратном порядке
fun main1() {
    val array = arrayOf("┻━┻)", "╯ (", "°) ", "° □", "(╯ ")
    for (index in array.lastIndex downTo 0) {
        print(array[index])
    }

}

//Задача 2
//Отсортировать массив в порядке возрастания любыми средствами и вывести в консоль результат
fun main2() {
    val array = arrayOf(21, 88, 71, 62, 21, 4, 55, 7, 44, 0, -11, 1222)
    array.sort()
    array.forEach { print("$it, ") }

}

//Задача 2
//Второе решение
fun main3() {
    val array = arrayOf(21, 88, 71, 62, 21, 4, 55, 7, 44, 0, -11, 1222)
    val sortedArray = arrayOfNulls<Int>(array.size)
    for (sortedIndex in 0..sortedArray.lastIndex) {
        var minimalValue = Int.MAX_VALUE
        for (arrayIndex in 0..array.lastIndex) {
            if (minimalValue > array[arrayIndex]) {
                minimalValue = array[arrayIndex]
            }
        }
        sortedArray[sortedIndex] = minimalValue
        array[array.indexOf(minimalValue)] = Int.MAX_VALUE
    }
    sortedArray.forEach { print("$it, ") }
}

//Задача 3*
//Даны 2 массива одинаковой длины.
//Создать третий массив, в котором будут чередоваться значения из 1 и 2 массива
// Вывести элементы финального массива в 1 строку
fun main3A() {
    val array1 = arrayOf("Н", "д", "ж", "а", "-", "м", "й", "к", "м", "а", " ", "е", "н", "й", " ", " ", "д", "ч", " ", " ", "а", "р", "д", " ", "а", "с", "е", "о", "т", ".", "А", "п", "с", "и", "д", "в", "л", "н", " ", "д", "о", ",", "ч", "о", " ", "о", "ь", "о", "о", "д", "м", " ", " ", "е", " ", "е", "о", "ь")
    val array2 = arrayOf("а", "е", "д", " ", " ", "о", " ", "о", "п", "с", "з", "м", "о", ".", "А", "у", "а", "а", "-", "н", "г", "а", "а", "з", " ", "м", "л", "с", "ь", " ", " ", "е", "н", " ", "о", "о", "ь", "о", "о", "н", "й", " ", "т", "б", "т", "л", "к", " ", " ", "о", "е", "в", "н", "й", "п", "л", "с", "!")
    val array3 = arrayOfNulls<String>(array1.size * 2)
    for (index in 0..(array3.lastIndex / 2)) {
        array3[index * 2] = array1[index]
        array3[index * 2 + 1] = array2[index]
    }
    array3.forEach { print(it) }
}
