package esz.dev.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class SaveTheQueenTest {

    @Test
    fun test1() {
        val n = 3
        val soldiers = arrayOf(1000, 100, 100, 100)
        val actual = solve(n, soldiers)
        assertEquals(150.00, actual)
    }

    @Test
    fun test2() {
        val n = 3
        val soldiers = arrayOf(10, 15, 10, 1000)
        val actual = solve(n, soldiers)
        assertEquals(17.5, actual)
        //println("%.10f".format(actual))
    }
}