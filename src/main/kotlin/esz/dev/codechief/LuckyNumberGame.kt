//https://www.codechef.com/problems/HP18

package esz.dev.codechief

fun solve(numbers: List<Int>, luckyNumberAlice: Int, luckyNumberBob: Int): String {
    val divByAlice = numbers.count { it % luckyNumberAlice == 0 }
    val divByBob = numbers.count { it % luckyNumberBob == 0 }
    val divByBoth = numbers.count { it % luckyNumberAlice == 0 && it % luckyNumberBob == 0 }
    val offSetForBob = if (divByBoth > 0) {
        1
    } else {
        0
    }
    return if (divByAlice > divByBob - offSetForBob) {
        "BOB"
    } else {
        "ALICE"
    }
}


//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    for (i in 0 until n) {
//        val values = readLine()?.split(" ")?.map { value: String ->
//            value.toInt()
//        }?.toMutableList() ?: mutableListOf()
//        val numbers = readLine()?.split(" ")?.map { value: String ->
//            value.toInt()
//        }?.toMutableList() ?: mutableListOf()
//        println(solve(numbers, values[1], values[2]))
//    }
//}
