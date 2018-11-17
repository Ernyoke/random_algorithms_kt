package esz.dev

import org.junit.Test
import kotlin.test.assertEquals

class VasiaAndMultisetsTest {
    @Test
    fun test1() {
        val numbers = listOf(9, 9, 72, 55, 14, 8, 55, 58, 35, 67, 3, 18, 73, 92, 41, 49, 15, 60, 18, 66, 9, 26, 97,
            47, 43, 88, 71, 97, 19, 34, 48, 96, 79, 53, 8, 24, 69, 49, 12, 23, 77, 12, 21, 88, 66, 9, 29, 13, 61, 69,
            54, 77, 41, 13, 4, 68, 37, 74, 7, 6, 29, 76, 55, 72, 89, 4, 78, 27, 29, 82, 18, 83, 12, 4, 32, 69, 89, 85,
            66, 13, 92, 54, 38, 5, 26, 56, 17, 55, 29, 4, 17, 39, 29, 94, 3, 67, 85, 98, 21, 14)
        val (res, sets) = esz.dev.codeforces.solve(numbers)
        assert(res)
        assertEquals(sets, "AAAAAAAABAAAAAAABAAAAAABAABAABABABAAAAABAAAAAAAAAAAAAAABABABAAAAAABAABAAAABAAAAAAAABAAAAAAABAAAAABAA")
    }

    @Test
    fun test2() {
        val numbers = listOf(2, 1, 1, 1, 1)
        val (res, sets) = esz.dev.codeforces.solve(numbers)
        assert(res)
        assertEquals( "ABAAA", sets)
    }
}