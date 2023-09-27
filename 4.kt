// Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат. 
// Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. 
// Числа могут быть вещественными. 
// Числа и знак операции разделяются между собой одним пробелом.
//  Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ
fun main() {
    println("Введите числа и операцию в формате ")
    println("число1 пробел число2 операция")
    println("доступные операции: / * + -")

    val str = readln()
    
    var operand1 = ""
    var operand2 = ""
    var operation = ""

    for (i in 0..(str.length-1)) {
        if ((str[i].toString() == " ") && (operand1 == "")) {
            for (j in 0..(i-1)) {
                operand1 = operand1 + str[j]
            }
        } else if ((str[i].toString() == " ") && (operation == "")) {
            operation = str[i-1].toString()
            for (j in i..(str.length-1)) {
                operand2 = operand2 + str[j]
            }
        } 
    }

    if (operation == "+") {
        println(operand1.toDouble()+operand2.toDouble())
    } else if (operation == "-") {
        println(operand1.toDouble()-operand2.toDouble())
    } else if (operation == "*") {
        println(operand1.toDouble()*operand2.toDouble())
    } else if (operation == "/") {
        println(operand1.toDouble()/operand2.toDouble())
    } else {
        println("something goes wrong!")
    }
}
