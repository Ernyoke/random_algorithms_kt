package esz.dev.other

// graph: Array<Array<Int>> - adjacency matrix (https://en.wikipedia.org/wiki/Adjacency_matrix)
fun solveDijkstra(graph: Array<Array<Int>>, startPoint: Int): IntArray {
    val shortestPath = IntArray(graph.size) { i -> graph[startPoint][i] }
    for (i in 0 until graph.size) {
        var wasMinFound = false
        for (j in 0 until graph.size) {
            for (k in 0 until graph.size) {
                if (j != startPoint && shortestPath[j] > shortestPath[k] + graph[k][j]) {
                    shortestPath[j] = shortestPath[k] + graph[k][j]
                    wasMinFound = true
                }
            }
        }
        if (!wasMinFound) {
            break
        }
    }
    return shortestPath
}