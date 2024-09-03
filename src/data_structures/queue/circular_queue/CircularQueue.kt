package src.data_structures.queue.circular_queue

fun main(){
    val queue = StaticCircularQueue(5)
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    queue.enqueue(5)
    queue.dequeue()
    queue.dequeue()
    queue.dequeue()
    queue.enqueue(55)
    queue.enqueue(54)
    queue.enqueue(54)
    queue.enqueue(54)
    queue.print()
}



class StaticCircularQueue(size : Int) {
    private val queue = IntArray(size)
    private var front = -1
    private var rear = -1

    //check if empty
    fun isEmpty() = queue.size == 0

    // insert at end
    fun enqueue(value : Int){
        if (front == -1 && rear == -1){
            queue[0] = value
            front = 0
            rear = 0
        }
        else if ((rear + 1) % queue.size == front){
            println("!!!!!!!!queue overflow!!!!!!!!!1")
        }
        else{
            rear = (rear + 1) % queue.size
            queue[rear] = value
        }
    }

    // delete from end
    fun dequeue(){
        if (isEmpty()){
            println("!!!!!!Nothing to dequeue!!!!!!")
        }
        else if(queue.size == 1){
            queue[0] = 0
        }
        else{
            queue[front] = 0
            front++
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