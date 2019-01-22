package esz.dev.codechief

import org.junit.Assert.*
import org.junit.Test

class LuckyNumberGameTest {
    @Test
    fun test1() {
        val numbers = listOf(1, 2, 3, 4, 5)
        val luckyNumberAlice = 3
        val luckyNumberBob = 2
        assertEquals("ALICE", solve(numbers, luckyNumberAlice, luckyNumberBob))
    }

    @Test
    fun test2() {
        val numbers = listOf(1, 2, 3, 4, 5)
        val luckyNumberAlice = 2
        val luckyNumberBob = 4
        assertEquals("BOB", solve(numbers, luckyNumberAlice, luckyNumberBob))
    }
}