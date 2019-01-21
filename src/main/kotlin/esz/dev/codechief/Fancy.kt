// https://www.codechef.com/problems/FANCY

package esz.dev.codechief

fun solve(quote: String): String {
    val trimmedQuote = quote.trim()
    return if (trimmedQuote == "not" ||
        trimmedQuote.contains(" not ") ||
        trimmedQuote.startsWith("not ") ||
        trimmedQuote.endsWith(" not")) {
        "Real Fancy"
    } else {
        "regularly fancy"
    }
}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    for (i in 0 until n) {
//        val line = readLine().toString()
//        println(solve(line))
//    }
//}