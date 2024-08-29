package src.data_structures.linkedlist.singly_linked_list


fun main(){
    val linkedList = LinkedList(-11)
    linkedList.append(5)
    linkedList.append(6)
    linkedList.append(7)
    linkedList.append(8)
    linkedList.prepend(1)
    linkedList.insert(2, -91)
    linkedList.insert(0, -91)
    linkedList.insert(7, -91)
    linkedList.print()
//    println(linkedList.asList())
}


class LinkedList(value: Int) {

    private var head : Node? = Node(value)
    private var tail : Node? = head
    var length : Int = 1

    fun print(){
        if (head == null){
            println("empty list")
        }
        else{
            var current_node : Node? = head
            while (current_node?.next != null){
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
            while (current_node?.next != null){
                list += current_node.value
                current_node = current_node.next
                i++
            }
        }
        return list
    }

    //to append node at the end
    fun append(value: Int){
        val newNode = Node(value)
        tail?.next = newNode // to attach new node with current tail
        tail = newNode // to assign newNode as tail for future append
        length++
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
        if (index > length - 1 || index < 0){
            println("enter valid index")
        }
        else if (index == 0){
            prepend(value)
        }
        else if (index == length - 1){
            append(value)
        }
        else{
            println("jdsk")
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