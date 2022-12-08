fun main() {
    // put your code here
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    var number3 = number1

    for (i in number1..number2 - 1) {
        number3 += i + 1
    }
    println(number3)
}
