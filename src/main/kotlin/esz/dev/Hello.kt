package esz.dev

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val values = readLine()?.split(" ")?.map { value: String ->
        value.toInt()
    }?.toMutableList() ?: mutableListOf()
    val (res, multiSets) = esz.dev.codeforces.solve(values)
    if (res) {
        println("YES")
        println(multiSets)
    } else {
        println("NO")
    }
}