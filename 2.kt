//Создать приложение, которое подсчитывает количество различных символов во введенной строке.
// Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем: 
// A - 3
// D - 2
// S - 3

fun main() {
    print("Введите строку: ")
    val str = readln()
    
    val letterCount = mutableMapOf<Char, Int>()

    for (i in 0..(str.length-1)) {
        var letter = str[i]

        if (letterCount[letter] == null) {
            letterCount[letter] = 1
        } else {
            letterCount[letter] = letterCount[letter]!! + 1
        }
    }

    val sortedMap = letterCount.toSortedMap(compareBy { it })
    println(sortedMap)
}