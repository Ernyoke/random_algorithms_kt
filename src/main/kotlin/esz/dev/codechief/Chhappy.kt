package esz.dev.codechief

fun solve(values: List<Int>): Boolean {
    val df = mutableMapOf<Int, MutableSet<Int>>()
    for (value in values.map { it -> it - 1 }) {
        df.compute(values[value]) {
            _, set ->
                if (set == null) {
                    mutableSetOf(value)
                } else {
                    set.add(value)
                    set
                }
        }
    }
    return df.filter { it.value.size > 1 }.isNotEmpty()
}

/*
fun main(args: Array<String>) = repeat(readLine()?.toInt() ?: 0) {
    val n = readLine()!!.toInt()
    val values = readLine()?.split(" ")?.map { value: String ->
        value.toInt()
    }?.toMutableList() ?: mutableListOf()
    println(if (solve(values)) "Truly Happy" else "Poor Chef")
}
*/