// https://codeforces.com/problemset/problem/122/A

package esz.dev.codeforces

fun Int.isLucky(): Boolean {
    var number = this
    while (number > 0) {
        val lastDigit = number % 10
        if (lastDigit !in listOf(4, 7)) {
            return false
        }
        number /= 10
    }
    return true
}

fun solve(value: Int): Boolean {
    val luckyNumbers = mutableListOf<Int>()
    for (i in 1 until 1000) {
        if (i.isLucky()) {
            luckyNumbers.add(i)
        }
    }
    for (divisor in luckyNumbers) {
        if (value % divisor == 0) {
            return true
        }
    }
    return false
}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    println(if (solve(n)) "YES" else "NO")
//}