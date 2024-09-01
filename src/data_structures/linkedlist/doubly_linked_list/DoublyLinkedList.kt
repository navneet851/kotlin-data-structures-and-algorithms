package src.data_structures.linkedlist.doubly_linked_list

import com.sun.jdi.Value

fun main(){
    val dLinkedList = DoublyLinkedList()
    dLinkedList.append(2)
    dLinkedList.prepend(5)
    dLinkedList.prepend(6)
    dLinkedList.append(6)
    dLinkedList.append(7)
    dLinkedList.prepend(4)
    dLinkedList.print()
    dLinkedList.printReverse()
    dLinkedList.deleteFirst()
    dLinkedList.print()
    dLinkedList.delete()
    dLinkedList.print()
    dLinkedList.deleteIndexItem(2)
    dLinkedList.print()
    dLinkedList.insert(2, -11)
    dLinkedList.print()
    dLinkedList.update(3, 33)
    dLinkedList.print()
    println(dLinkedList.asList())
}



class DoublyLinkedList {
    private var head : Node? = null
    private var length : Int = 0

    fun append(value: Int){
        if (head == null){
            prepend(value)
        }
        else{
            val newNode = Node(value)
            var currentNode = head
            while (currentNode?.next != null){
                currentNode = currentNode.next
            }
            currentNode?.next = newNode
            newNode.previous = currentNode
            length++
        }
    }

    fun prepend(value: Int){
        val newNode = Node(value)
        if (head == null){
            head = newNode
        }
        else{
            newNode.next = head
            head?.previous = newNode
            head = newNode
        }
        length++
    }

    //to insert value at index
    fun insert(index : Int, value: Int){
        if (index > length  || index < 0){
            println("    !!!!!!!!enter valid index!!!!!!!!")
        }
        else if (index == 0){
            prepend(value)
        }
        else if (index == length){
            append(value)
        }
        else{
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

    //to update particular index
    fun update(index : Int, value: Int){
        if (index > length - 1  || index < 0){
            println("    !!!!!!!enter valid index!!!!!!!")
        }
        else if (index == 0){
            head?.value = value
        }
        else{
            var i = 0
            var currentNode = head
            while (i != index){
                currentNode = currentNode?.next
                i++
            }
            currentNode?.value = value
        }
    }

    // to delete last node
    fun delete(){
        if (head == null){
            println("   !!!!!!!!!!nothing to delete!!!!!!!!!")
        }
        else{
            var currentNode : Node? = head
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
            println("!!!!!!!!!nothing to delete!!!!!!!!!!!")
        }
        else{
            head = head?.next
            length--
        }
    }

    //Deletion from particular index
    fun deleteIndexItem(index: Int){

        if (index > length-1  || index < 0){
            println("!!!!!!!!!!!enter valid index!!!!!!!!!!!")
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

    fun print(){
        println("length is $length")
        if (head == null){
            println("!!!!!!!!1empty list!!!!!!!!!!!!")
        }
        else{
            var currentNode = head
            print("next    ")
            while (currentNode != null){
                print(" -> ${currentNode.value}")
                currentNode = currentNode.next
            }
        }
        println()
    }

    fun printReverse(){
        println("length is $length")
        if (head == null){
            println("!!!!!!!!!empty list!!!!!!!!!!")
        }
        else{
            var currentNode = head
            while (currentNode?.next != null){
                currentNode = currentNode.next
            }
            print("previous   ")
            while (currentNode != null){
                print(" ${currentNode?.value} <-")
                currentNode = currentNode?.previous
            }
        }
        println()
    }

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
}