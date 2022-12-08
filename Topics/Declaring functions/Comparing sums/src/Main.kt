// write your function here
fun isGreater(p1: Int, p2: Int, p3: Int, p4: Int) = p1 + p2 > p3 + p4

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}