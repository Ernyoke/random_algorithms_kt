package esz.dev.hackerrank

import org.junit.Test
import kotlin.test.assertEquals

class HangingPostersTest {
    @Test
    fun test1() {
        val h = 5
        val wallPoints = arrayOf(15, 11, 17)
        val lengths = arrayOf(5, 1, 2)

        val actualResult = solve(h, wallPoints, lengths)

        assertEquals(12, actualResult)
    }

    @Test
    fun test2() {
        val h = 5
        val wallPoints = arrayOf(5, 5)
        val lengths = arrayOf(4, 4)

        val actualResult = solve(h, wallPoints, lengths)

        assertEquals(0, actualResult)
    }
}