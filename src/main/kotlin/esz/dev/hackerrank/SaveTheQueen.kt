// https://www.hackerrank.com/contests/hourrank-31/challenges/save-the-queen/problem

package esz.dev.hackerrank

fun solve(n: Int, soldiers: Array<Int>): Double {
    soldiers.sortDescending()
    var on = soldiers.copyOfRange(0, n).sum()
    val off = soldiers.copyOfRange(n, soldiers.size).sum()
    var i = 0
    val avg: () -> Double = { (on + off).toDouble() / (n - i).toDouble() }
    while (avg() < soldiers[i] && i < n) {
        on -= soldiers[i]
        i++
    }
    return avg()
}