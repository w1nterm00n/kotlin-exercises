//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.
fun main() {
    print("Введите натуральное число: ")
    val input = readln().toInt()


    if (input == 0 || input < 1) {
        println("Введено некорректное число.")
        return
    }

    val binary = Integer.toBinaryString(input)
    println("Двоичное число: $binary")
}