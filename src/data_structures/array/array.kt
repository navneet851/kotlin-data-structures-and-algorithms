package src.data_structures.array

import kotlin.Array

// Array basic operations
//insertion, deletion, replace, gettingValueIndex



fun main() {
    val array = Array()
    array.insert( 9)
    array.insert(7)
    array.insert(7)
    array.insertAtStart(1)
    array.insertAtIndex(4,-66)
    //array.insertAtIndex(0, 3)
    array.print()
}



class Array{

    private var arr = emptyArray<Int>()

    //Start
    fun insertAtStart(value: Int){
        val newArr = arr + Int.MAX_VALUE
        for (i in newArr.size -1 downTo 1){
            newArr[i] = newArr[i-1]
        }
        newArr[0] = value
        arr = newArr
    }

    //End
    fun insert(value: Int){
        arr += value
    }




    //At particular Index
    fun insertAtIndex(index : Int, value : Int){
        if (index > arr.size - 1 || index < 0){
            println("IndexOutOfBound")
        }

        if (index == arr.size){
            insert(value)
        }
        else if (index == 0){
            insertAtStart(value)
        }
        else{
            val newArr = arr + Int.MAX_VALUE

            for (i in newArr.size -1 downTo index){
                newArr[i] = newArr[i-1]
            }
            newArr[index] = value
            arr = newArr
        }

    }

    fun print(){
        //using function
        println(arr.contentToString())

        //using loop

//        if (arr.isEmpty()){
//            println("array is empty")
//        }
//        else{
//            for (item in arr){
//                print(item)
//            }
//        }
    }
}