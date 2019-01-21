package esz.dev.other

import org.junit.Assert.*
import org.junit.Test

class SieveOfEratosthenesKtTest {
    @Test
    fun test1() {
        val actualResult = solveSieve(50)
        assertEquals(50, actualResult.size)
        actualResult.forEach {
            println(it)
        }
    }

    @Test
    fun test2() {
        val actualResult = solveSieve(150)
        assertEquals(150, actualResult.size)
        actualResult.forEach {
            println(it)
        }
    }
}