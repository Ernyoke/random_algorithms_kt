package esz.dev.other

import org.junit.Assert.*
import org.junit.Test

class DijkstraTest {
    @Test
    fun test1() {
        val inf = Int.MAX_VALUE / 2
        val graph = arrayOf(
            arrayOf(0, 10, inf, 1, 1, inf), // 0
            arrayOf(10, 0, inf, inf, inf, 3), // 1
            arrayOf(inf, inf, 0, inf, inf, inf), // 2
            arrayOf(1, inf, inf, 0, 4, 5), //3
            arrayOf(1, inf, inf, 4, 0, inf), //4
            arrayOf(inf, 3, inf, 5, inf, 0) //5
        )
        val actualResult = solveDijkstra(graph, 4)
        val expectedResult = arrayOf(1, 10, inf, 2, 0, 7)
        for (i in 0 until expectedResult.size) {
            assertEquals(expectedResult[i], actualResult[i])
        }
    }

    @Test
    fun test2() {
        val inf = Int.MAX_VALUE / 2
        val graph = arrayOf(
            arrayOf(0, inf, 2, 3), // 0
            arrayOf(inf, 0, 1, 10), // 1
            arrayOf(2, 1, 0, inf), // 2
            arrayOf(3, 10, inf, 0) //3
        )
        val actualResult = solveDijkstra(graph, 1)
        val expectedResult = arrayOf(3, 0, 1, 6)
        for (i in 0 until expectedResult.size) {
            assertEquals(expectedResult[i], actualResult[i])
        }
    }
}