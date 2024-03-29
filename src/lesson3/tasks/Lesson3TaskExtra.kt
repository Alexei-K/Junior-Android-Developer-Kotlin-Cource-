package lesson3.tasks

/**
 * УРОК 3 Дополнительные задания для повторения
 * Важные моменты:
 * 0) Метод и функция это синонимы.
 * 1) Нужно разделять понятия "Возвращаемое значение метода" и "Вывод в консоль".
 * Первое - возвращает результат вычислений вашей функции туда, где она была вызвана.
 * Второе... Выводит текст в консоль =)
 *
 * 2) если в задании не сказано, что метод, что-то возвращает - он ничего не возвращает.
 * Тоже самое касается принимаемых значений.
 *
 * 3) если функция что-то возвращает - при проверке задания выведите это значение в консоль
 *
 * 4) функция return завершает(!!) выполнение текущего метода и возвращает значение, которое функция должна вернуть.
 *
 * Удачи!
 */

/**
 * Задача 1
 * Создать метод seriousGuy, который принимает имя человека(текст) и выводит в консоль "Mr. " и имя человека
 */

/**
 * Задача 2
 * Создать метод getJoke, который возвращает текст "Колобок повесился".
 */

/**
 * Задача 3
 * Создать метод sum, который принимает 2 Int и возвращает их сумму.
 */

/**
 * Задача 4
 * Создать метод square, который принимает Int и возвращает это число в квадрате.
 */

/**
 * Задача 5
 * Создать метод powerBy, который принимает 2 Int числа и возвращает результат возведения первого числа в степень второго числа.
 * Пример: для числе 2 и 4 вернется число 16
 */

/**
 * Задача 6
 * Добавить 1 строчку кода в указаном месте, чтобы функция возвращала число 5
 * Если не получается, спойлер: смотри важный момент№4 в начале документа.
 */

fun task6fun(): Int {
    var number = 0
    number = 1
    number = 2
    number = 3
    number = 4
    number = 5
    // Тут будет ваша строчка кода
    number = 6
    number = 7
    number = 8
    return number
}

/**
 * Задача 7
 * Добавить в метод ниже принимаемую переменную isDrunk, которая означает что водитель пьян.
 * Если она true, не выполнять всё остальное в методе.
 * Обязательное условие: в код этого метода нельзя добавлять фигурные скобки {}
 */

fun drive(kilometer: Int) {

    for (km in 1..kilometer) {
        println("Проехали $km-й киллометр")
    }
    println("Приехали")
}

/**
 * Задача 8
 * Создать метод который принимает фамилию человека и Boolean переменную IsMale(является ли мужчиной)
 * И возвращает "Mr." или "Mrs." + фамилию в зависимости от пола
 */

/**
 * Задача 9
 * Создать метод formatToDollars, который принимает инт numberOfCents и char separator, а возвращает текст с долларами.
 * Примеры: принимает 9000 и '.' возвращает 90.00$
 * принимает 500 и ',' возвращает 5,00$
 */

/**
 * Задача 10
 * Создать функцию, принимающую инт, выводящую в консоль столько раз фразу "Ты молодец".
 * Задание со звездочкой(just for fun): эта функция возвращает float означающий сколько секунд
 * понадобилось программе на выполнение этого метода.
 */



