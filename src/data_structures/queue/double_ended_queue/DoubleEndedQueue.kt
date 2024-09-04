package src.data_structures.queue.double_ended_queue

fun main(){
    val queue = DoubleEndedQueue(5)
    println(queue.isEmpty())
    queue.addRear(2)
    queue.addRear(3)
    queue.addRear(4)
    queue.addRear(4)
//    queue.addRear(4)
    queue.removeFront()
    queue.removeFront()
    queue.addFront(-1)
    queue.addFront(-11)
    queue.removeFront()
    queue.removeRear()
    queue.addRear(43)
    queue.addFront(43)

    queue.printRF()
    println(queue.isEmpty())
    queue.print()
}

class DoubleEndedQueue(size : Int) {
    private val queue = IntArray(size)
    private var front = -1
    private var rear = -1

    //check if empty
    fun isEmpty() = (rear == -1 && front == -1)

    // print rear front queue index
    fun printRF(){
        println("front at $front and rear at $rear")
    }

    // insert at end
    fun addRear(value : Int){
        if (front == -1 && rear == -1){
            queue[0] = value
            front = 0
            rear = 0
        }
        else if (rear == queue.size - 1){
            println("!!!!!!!!queue overflow!!!!!!!!!1")
        }
        else{
            rear++
            queue[rear] = value
        }
    }

    //insert from start
    fun addFront(value : Int){
        if (queue[0] != 0){
            println("!!!!!!queue front overflow!!!!!!")
        }
        else{
            var i = 0
            while (queue[i+1] == 0){
                i++
            }
            queue[i] = value
            front--
        }
    }

    // delete from end
    fun removeFront(){
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

    // remove from end
    fun removeRear(){
        if(isEmpty()){
            println("!!!!!!Nothing to dequeue!!!!!!")
        }
        else{
            queue[rear] = 0
            rear--
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
            print("|--> DeQueue(delete)")
            println()
            print("                    ")
            for (i in queue.indices) {
                if (i != 0) print("|")
                print("   ${queue[i]}   ")
            }
            println()
            print("EnQueue(insert) |-->")
            for (i in queue.indices) {
                print("--------")
            }
            print("<--| EnQueue(insert)")
            println()

        }

    }
}