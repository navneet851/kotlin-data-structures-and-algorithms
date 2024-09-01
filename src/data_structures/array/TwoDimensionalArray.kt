package src.data_structures.array

import src.data_structures.linkedlist.doubly_linked_list.DoublyLinkedList

fun main(){
    val arr = TwoDimensionalArray(2, 2)
    arr.insert(1)
    arr.insert(4)
    arr.print()
    arr.insert(5)
    arr.insert(5)
    arr.print()
    arr.update(0,1, -11)
    arr.print()
    arr.delete(1,0)
    arr.print()
    arr.insert(-88)
    arr.print()
}


class TwoDimensionalArray(private val rows : Int, private val cols : Int) {
    private val arr = Array(rows){ IntArray(cols){ Int.MIN_VALUE} }

    init {
        println("the array is $rows x $cols size")
        println("empty elements filled with min-integer value")
        println()
    }


    //insert value at first empty found location on traversal
    fun insert(value : Int){
        for (i in 0..< rows){
            for (j in 0..< cols){
                if (arr[i][j] == Int.MIN_VALUE){
                    arr[i][j] = value
                    return
                }
                if (i == rows - 1 && j == cols - 1){
                    println("!!!!!!!!!!array is full!!!!!!!!!")
                }
            }
        }
    }

    //updates element on particular index
    fun update(row : Int, col : Int, value: Int){
        if (row > rows - 1 || col > cols -1 || row < 0 || col < 0){
            println("!!!!!!!enter valid index to update!!!!!!!!")
        }
        else{
            arr[row][col] = value
        }

    }

    //delete element on particular index
    fun delete(row : Int, col : Int){
        if (row > rows - 1 || col > cols -1 || row < 0 || col < 0){
            println("!!!!!!!enter valid index to delete!!!!!!!!")
        }
        else{
            arr[row][col] = Int.MIN_VALUE
        }

    }

    //prints the 2d array
    fun print(){
        println(arr.contentDeepToString())
    }
}