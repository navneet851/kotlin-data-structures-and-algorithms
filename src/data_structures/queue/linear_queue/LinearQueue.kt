package src.data_structures.queue.linear_queue

fun main(){
    val queue = LinearQueue()
    println(queue.isEmpty())
    queue.enqueue(4)
    queue.enqueue(5)
    queue.enqueue(6)
    queue.enqueue(7)
    queue.enqueue(8)
    queue.enqueue(9)
    queue.dequeue()
    queue.dequeue()
    println("peek(top value) is " + queue.peek())
    println(queue.isEmpty())
    queue.print()

}

class LinearQueue {
    private var queue : Array<Int> = emptyArray()

    //check if empty
    fun isEmpty() = queue.size == 0

    // return top element
    fun peek() = if (isEmpty()) 0 else queue[queue.size - 1]

    // insert at end
    fun enqueue(value : Int){
        queue += value
    }

    // delete from end
    fun dequeue(){
        if (isEmpty()){
            println("Nothing to delete")
        }
        else if(queue.size == 1){
            queue = emptyArray()
        }
        else{
            for (i in 0..< queue.size - 1){
                queue[i] = queue[i+1]
            }
            val newQueue = queue.copyOf(queue.size -1)
            queue = newQueue.filterNotNull().toTypedArray()
        }
    }

    fun print(){
        if (isEmpty()){
            println("!!!!!!!!empty queue!!!!!!!!")
        }
        else{
            println()
            print("DeQueue(delete) <--|")
            for (i in queue.indices) {
                print("--------")
            }
            println()
            print("                    ")
            for (i in queue.indices) {
                if (i != 0) print("|")
                print("   ${queue[i]}   ")
            }
            println()
            print("                    ")
            for (i in queue.indices) {
                print("--------")
            }
            print("<--| EnQueue(insert)")
            println()
        }

    }
}