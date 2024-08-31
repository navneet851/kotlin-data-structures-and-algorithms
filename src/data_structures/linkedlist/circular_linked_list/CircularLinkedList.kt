package src.data_structures.linkedlist.circular_linked_list

import src.data_structures.linkedlist.singly_linked_list.Node


fun main(){
    val linkedList = CircularLinkedList()
    linkedList.append(5)
    linkedList.append(6)
    linkedList.append(7)
    linkedList.append(8)
    linkedList.insert(0, -44)
    linkedList.prepend(34)
    linkedList.prepend(3)
    linkedList.print()
    println(linkedList.asList())
}

class CircularLinkedList {
    private var head : Node? = null
    private var length : Int = 0

    fun print(){
        println("\n length is $length")
        if (head == null){
            println("empty list")
        }
        else{
            var currentNode : Node? = head
            do {
                print(" -> ${currentNode?.value}")
                currentNode = currentNode?.next
            }
            while (currentNode != head)

            // using do while loop to reach the back of head
            // in circular list which in next cycle
            // not in first traverse.
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
            var currentNode : Node? = head
            do {
                list += currentNode!!.value
                currentNode = currentNode?.next
                i++
            }
            while (currentNode != head)
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
            var currentNode : Node? = head
            while (currentNode?.next != head){
                currentNode = currentNode?.next
            }
            currentNode?.next = newNode //to attach newnode at end
            newNode.next = head // joining new node with head
            length++
        }
    }




    //to prepend node at start
    fun prepend(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
            newNode.next = head
        } else {
            var currentNode: Node? = head
            while (currentNode?.next != head) {
                currentNode = currentNode?.next
            }
            newNode.next = head
            head = newNode
            currentNode?.next = head
        }
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
            val newNode = Node(value)
            var currentNode  = head
            for (i in 0..< index - 1){
                currentNode = currentNode?.next
            }
            newNode.next = currentNode?.next
            currentNode?.next = newNode
            length++
        }
    }

    fun delete(){
        if (head == null){
            println("nothing to delete")
        }
        else{
            var currentNode :Node? = head
            while (currentNode?.next?.next != null){
                currentNode = currentNode.next
            }
            currentNode?.next = null
            length--
        }
    }

    // to delete first node
    fun deleteFirst(){
        if (head == null){
            println("nothing to delete")
        }
        else{
            head = head?.next
            length--
        }
    }

    //Deletion from particular index
    fun deleteIndexItem(index: Int){

        if (index > length-1  || index < 0){
            println("enter valid index")
        }
        else if (index == 0){
            deleteFirst()
        }
        else if (index == length - 1){
            delete()
        }
        else{
            var currentNode = head
            var i = 0
            while(i < index - 1){
                currentNode = currentNode?.next
                i++
            }
            currentNode?.next = currentNode?.next?.next
            length--
        }
    }
}