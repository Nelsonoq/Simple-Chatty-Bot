fun main() {
    // put your code here
    val number1 = readln().toLong()
    val number2 = readln().toLong()
    var res = 1L

    for (i in number1 until number2){
        res *= i
    }
    print(res)
}