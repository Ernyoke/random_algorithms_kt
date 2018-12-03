// https://codeforces.com/contest/1073/problem/B

package esz.dev.codeforces

fun solve(books: List<Int>, order: List<Int>): IntArray {
    val countBooks = IntArray(books.size + 1)
    for (i in 0 until books.size) {
        countBooks[books[i]] = i + 1
    }
    val result = IntArray(books.size)
    var diff = 0
    for (i in 0 until order.size) {
        val orderNr = order[i]
        if (countBooks[orderNr] > diff) {
            result[i] = countBooks[orderNr] - diff
            diff = countBooks[orderNr]
        } else {
            result[i] = 0
        }
    }
    return result
}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val books = readLine()?.split(" ")?.map { value: String -> value.toInt() }?.toMutableList() ?: mutableListOf()
//    val order = readLine()?.split(" ")?.map { value: String -> value.toInt() }?.toMutableList() ?: mutableListOf()
//    val res = solve(books, order)
//    res.forEach {
//        print("$it ")
//    }
//    println()
//}