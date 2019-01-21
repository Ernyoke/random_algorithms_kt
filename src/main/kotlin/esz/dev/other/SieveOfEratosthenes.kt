package esz.dev.other

fun solveSieve(n: Int): List<Int> {
    val size = 1000
    val sieve = BooleanArray(size) { true }
    sieve[0] = false
    sieve[1] = false
    val result = mutableListOf<Int>()
    for (i in 0 until n) {
        val prim = sieve.indexOfFirst { it }
        result.add(prim)
        for (j in prim until size step prim) {
            sieve[j] = false
        }
    }
    return result
}