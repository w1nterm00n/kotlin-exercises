// Создать приложение, в котором пользователь вводит две различных цифры. 
// На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число. 
// Результат выводится в консоль. 
// При невозможности создать нечетное число выводится сообщение – «Создать нечетное число невозможно». 
// Каждое число вводится на отдельной строке
fun main() {
    println ("Введите первую цифру")
    var num1 = readln()
    println ("Введите вторую цифру")
    var num2 = readln()

    var number1 = num1 + num2
    var parsedNumber1: Int? = number1.toIntOrNull()
    var number2 = num2 + num1
    var parsedNumber2: Int? = number2.toIntOrNull()

    println("нечётное число из этих цифр: ")

    if (parsedNumber1 != null && parsedNumber2 != null) {
        if (parsedNumber1 % 2 != 0 && parsedNumber2 % 2 != 0) {
            println(parsedNumber1)
            println(parsedNumber2)
        } else if (parsedNumber1 % 2 != 0) {
            println(parsedNumber1)
        } else if (parsedNumber2 % 2 != 0) {
            println(parsedNumber2)
        } else {
            println("Ни одно из введенных чисел не является нечётным.")
        }
    } else {
        println("Ошибка ввода")
    }
}