//https://www.hackerrank.com/contests/hourrank-31/challenges/hanging-posters/problem

package esz.dev.hackerrank

fun solve(h: Int, wallPoints: Array<Int>, lengths: Array<Int>): Int {
    var max = 0
    for (i in 0 until wallPoints.size) {
        val boltedHeight = wallPoints[i] - 0.25 * lengths[i]
        max = Math.max(max, Math.ceil(boltedHeight).toInt())
    }
    return Math.max(0, max - h)
}

