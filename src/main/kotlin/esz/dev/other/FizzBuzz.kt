package esz.dev.other

import java.util.stream.IntStream

private fun fizzOrBuzz(n: Int): String {
    val fbFunction: (Int, String, ((String) -> String)) -> (String) -> String =
        { d, str, func -> if (n % d == 0) { _ -> str + func("") } else func }
    val identity: ((String) -> String) = { it }
    return fbFunction(3, "Fizz", fbFunction(5, "Buzz", identity))(n.toString())
}

fun solve(n: Int) {
    IntStream.iterate(1, { it < n }, { it.inc() }).forEach {
        println(fizzOrBuzz(it))
    }
}