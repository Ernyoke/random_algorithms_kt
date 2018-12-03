package esz.dev.codeforces

import org.junit.Test
import kotlin.test.assertEquals

class LuckyDivisionTest {
    @Test
    fun test1() {
        val actualRes = solve(47)
        assert(actualRes)
    }

    @Test
    fun test2() {
        val actualRes = solve(16)
        assertEquals(false, actualRes)
    }
}