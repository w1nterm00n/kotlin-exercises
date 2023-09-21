fun main() {
    println("write a string: ")
    var str = readln()
    
    var howManyTimes = 0

    for (i in 1..(str.length-1)) {
        var letter = str[i]
        if (letter == str.get(i-1)){
            howManyTimes++
            if ( ((i+1) < (str.length) && (str.get(i+1) !== letter)) || ((i+1) == (str.length))) {
                howManyTimes++
                print (letter + " " + howManyTimes + " ")
                howManyTimes = 0
            }
        } else if ( ((i+1) < (str.length) && (str.get(i+1) !== letter)) || ((i+1) == (str.length))) {
            print (letter + " ")
        }
    }
}