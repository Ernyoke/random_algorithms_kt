package esz.dev.codeforces

import org.junit.Test

class VasiaAndBooksTest {
    @Test
    fun test1() {
        val books = listOf(1, 2, 3)
        val order = listOf(2, 1, 3)

        val expectedResult = solve(books, order)
        assert(expectedResult contentEquals intArrayOf(2, 0, 1))
    }

    @Test
    fun test2() {
        val books = listOf(3, 1, 4, 2, 5)
        val order = listOf(4, 5, 1, 3, 2)

        val expectedResult = solve(books, order)
        expectedResult.forEach {
            print("$it ")
        }
        assert(expectedResult contentEquals intArrayOf(3, 2, 0, 0, 0))
    }

    @Test
    fun test3() {
        val books = listOf(6, 5, 4, 3, 2, 1)
        val order = listOf(6, 5, 3, 4, 2, 1)

        val expectedResult = solve(books, order)
//        expectedResult.forEach {
//            print("$it ")
//        }
        assert(expectedResult contentEquals intArrayOf(1, 1, 2, 0, 1, 1))
    }
}