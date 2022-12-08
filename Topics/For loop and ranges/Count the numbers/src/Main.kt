fun main() {
    // put your code here
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val n = readln().toInt()
    var sum = 0

    if (number2 % n > 0) {
        println(number2 / n - number1 / n)

    } else {
        println((number2 - number1) / n + 1)
    }
}