package src.data_structures.graph

class Graph<T> {
    private val graph : MutableMap<T, MutableList<T>> = mutableMapOf()

    fun addEdge(vertex1 : T, vertex2 : T, directional : Boolean = false) {
        graph[vertex1] = graph.getOrDefault(vertex1, mutableListOf()).apply { add(vertex2) }
        if (!directional) {
            graph[vertex2] = graph.getOrDefault(vertex2, mutableListOf()).apply { add(vertex1) }
        }
    }
}