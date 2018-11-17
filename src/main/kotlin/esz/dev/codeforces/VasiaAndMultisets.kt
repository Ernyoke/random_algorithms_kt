// https://codeforces.com/contest/1051/problem/C

package esz.dev.codeforces

fun Int.isNice(countNumbers: Map<Int, Int>): Boolean {
    return countNumbers[this] == 1
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Int.isOdd(): Boolean {
    return !this.isEven()
}

fun solve(numbers: List<Int>): Pair<Boolean, String> {
    val countNumbers = mutableMapOf<Int, Int>()
    numbers.forEach {
        countNumbers.compute(it) { _, value -> value?.inc() ?: 1 }
    }
    val nrNiceNumbers = countNumbers.filter { it.value == 1 }.size

    return if (nrNiceNumbers.isOdd() && countNumbers.filter { it.value > 2 }.isEmpty()
    ) {
        Pair(false, "")
    } else {
        val multiSets = Array(numbers.size) { "A" }
        var countClassified = 0
        for (i in 0 until numbers.size) {
            val multiSet = if (countClassified.isEven()) "A" else "B"
            if (numbers[i].isNice(countNumbers)) {
                multiSets[i] = multiSet
                countClassified++
            }
        }

        if (nrNiceNumbers.isOdd()) {
            for (i in 0 until numbers.size) {
                val number = numbers[i]
                if (countNumbers[number]!! > 2) {
                    multiSets[i] = "B"
                    break
                }
            }
        }
        Pair(true, multiSets.joinToString(separator = ""))
    }
}

//fun main(args: Array<String>) {
//    val n = readLine()!!.toInt()
//    val values = readLine()?.split(" ")?.map { value: String ->
//        value.toInt()
//    }?.toMutableList() ?: mutableListOf()
//    val (res, multiSets) = solve(values)
//    if (res) {
//        println("YES")
//        println(multiSets)
//    } else {
//        println("NO")
//    }
//}