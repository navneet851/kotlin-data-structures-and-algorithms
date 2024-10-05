package src.data_structures.graph

import src.data_structures.array.Array
import src.data_structures.queue.linear_queue.LinearQueue


fun main(){
    val graph = Graph()
//    graph.addEdge(0, 1, false)
//    graph.addEdge(1, 2, false)
//    graph.addEdge(2, 3, false)
//    graph.addEdge(3, 1, false)
//    graph.addEdge(3, 4, false)
//    graph.addEdge(4, 0, false)

    graph.addEdge(3, 1, false)
    graph.addEdge(1, 4, false)
    graph.addEdge(4, 2, false)
    graph.addEdge(2, 5, false)
    graph.addEdge(5, 0, false)
    graph.BFS()
    graph.printAdjList()
}
class Graph {
    private val graph : MutableMap<Int, MutableList<Int>> = mutableMapOf()
    private val bfsPrintList = Array()
    private val visitedBfsNodeList = mutableMapOf<Int, Boolean>()


    // to add an edge between two vertices
    fun addEdge(vertex1 : Int, vertex2 : Int, directional : Boolean) {
        graph[vertex1] = graph.getOrDefault(vertex1, mutableListOf()).apply { add(vertex2) }
        if (!directional) {
            graph[vertex2] = graph.getOrDefault(vertex2, mutableListOf()).apply { add(vertex1) }
        }
    }

    //to perform bfs is node is not visited
    private fun bfs(node : Int){
        //graph present
        //ans list present
        //visited node list present

        val queue = LinearQueue()
        queue.enqueue(node)
        visitedBfsNodeList[node] = true

        while (!queue.isEmpty()){
            val frontNode = queue.front()
            queue.dequeue()

            //storefront node in ans
            bfsPrintList.insert(frontNode)

            //put front node neighbour elements in queue
            for (i in graph[frontNode]!!){
                if (visitedBfsNodeList[i] == null){
                    queue.enqueue(i)
                    visitedBfsNodeList[i] = true // Mark as visited when enqueued
                }
            }
        }


    }

    fun BFS(){
        //graph present
        //ans list present
        //visited node list present

        // traverse graph to check this node is already visited or not
        for (i in graph.keys){
            if (visitedBfsNodeList[i] == null){
                bfs(i)
            }
        }
        println("BFS Traversal:")
        println(bfsPrintList.print())

    }

    // to print the adjacency list
    fun printAdjList(){
        println("\nAdjacent List:")
        for (vertex in graph.keys){
            print("$vertex -> ")
            for (adjVertex in graph[vertex]!!){
                print("$adjVertex ")
            }
            println()
        }
    }
}