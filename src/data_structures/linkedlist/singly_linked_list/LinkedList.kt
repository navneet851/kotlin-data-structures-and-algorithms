package src.data_structures.linkedlist.singly_linked_list


fun main(){
    val linkedList = LinkedList()
    linkedList.append(5)
    linkedList.append(6)
    linkedList.prepend(4)
    linkedList.prepend(3)
    linkedList.prepend(2)
    linkedList.prepend(1)
    linkedList.insert(0, -1)
    linkedList.insert(3, -19)
    linkedList.insert(6, -91)
    linkedList.print()
    println(linkedList.asList())


    println("\n \n \n -> 1 -> 2 -> 3 -> 4 -> 5 -> 6")
}


class LinkedList() {

    private var head : Node? = null
    var length : Int = 0



    fun print(){
        println("length is $length")
        if (head == null){
            println("empty list")
        }
        else{
            var current_node : Node? = head
            while (current_node != null){
                print(" -> ${current_node.value}")
                current_node = current_node.next
            }
        }
        println()
    }



    // return linkedList as list
    fun asList() : List<Int> {
        val list = mutableListOf<Int>()
        if (head == null){
            return emptyList()
        }
        else{
            var i = 0
            var current_node : Node? = head
            while (current_node != null){
                list += current_node.value
                current_node = current_node.next
                i++
            }
        }
        return list
    }




    //to append node at the end
    fun append(value: Int){
        if (head == null){
            prepend(value)
        }
        else{
            val newNode = Node(value)
            var current_node : Node? = head
            while (current_node?.next != null){
                current_node = current_node.next
            }
            current_node?.next = newNode //to attach newnode at end
            length++
        }
    }




    //to prepend node at start
    fun prepend(value: Int){
        val newNode = Node(value)
        newNode.next = head
        head = newNode
        length++
    }

    //to insert value at index
    fun insert(index : Int, value: Int){
        if (index > length  || index < 0){
            println("enter valid index")
        }
        else if (index == 0){
            prepend(value)
        }
        else if (index == length){
            append(value)
        }
        else{
            println("         jdkwwfejkfewf-------------sk")
            val newNode = Node(value)
            var current_node  = head
            for (i in 0..< index - 1){
                current_node = current_node?.next
            }
            newNode.next = current_node?.next
            current_node?.next = newNode
            length++
        }

    }
}