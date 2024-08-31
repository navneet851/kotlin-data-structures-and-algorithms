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

    fun print(){
        println("length is $length")
        if (head == null){
            println("empty list")
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
            println("empty list")
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