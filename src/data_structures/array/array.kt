package src.data_structures.array

// Array basic operations
// insertion, deletion, replace, gettingValueOfIndex


fun main() {
    val array = Array()
    array.insert(9)
    array.insert(8)
    array.insert(7)
    array.insert(5)
    array.insertAtStart(1)
    array.insertAtIndex(3, -66)
    array.print()
    println()
    array.getValue(4)
    array.replace(1, 43)
    array.print()
    println()
    array.delete()
    array.deleteFirst()
    array.print()
    array.deleteIndexItem(2)
    array.print()
}


class Array {

    private var arr = emptyArray<Int>()

    // get Value From Index
    fun getValue(index: Int) {
        if (index > arr.size - 1 || index < 0) {
            println("IndexOutOfBound")
        } else {
            println("value at index $index is ${arr[index]}")
        }
    }

    // Replace from particular index
    fun replace(index: Int, value: Int){
        if (index > arr.size - 1 || index < 0) {
            println("IndexOutOfBound")
        } else {
            arr[index] = value
        }
    }

    // Insertion at Start
    fun insertAtStart(value: Int) {
        val newArr = arr + Int.MAX_VALUE
        for (i in newArr.size - 1 downTo 1) {
            newArr[i] = newArr[i - 1]
        }
        newArr[0] = value
        arr = newArr
    }

    // Insertion At End
    fun insert(value: Int) {
        arr += value
    }


    // Insertion At particular Index
    fun insertAtIndex(index: Int, value: Int) {
        if (index > arr.size || index < 0) {
            println("IndexOutOfBound")
        } else {
            if (index == arr.size) {
                insert(value)
            } else if (index == 0) {
                insertAtStart(value)
            } else {
                val newArr = arr + Int.MAX_VALUE

                for (i in newArr.size - 1 downTo index) {
                    newArr[i] = newArr[i - 1]
                }
                newArr[index] = value
                arr = newArr
            }
        }
    }


    //Deletion from End
    fun delete(){
        if (arr.isEmpty()){
            println("Nothing to delete")
        }
        else{
            val newArr = arr.copyOf(arr.size - 1)
            arr = newArr.filterNotNull().toTypedArray()
        }
    }

    //Deletion from Start
    fun deleteFirst(){
        if (arr.isEmpty()){
            println("Nothing to delete")
        }
        else if(arr.size == 1){
            arr = emptyArray()
        }
        else{
            for (i in 0..< arr.size - 1){
                arr[i] = arr[i+1]
            }
            delete()
        }
    }

    //Deletion from particular index
    fun deleteIndexItem(index: Int){
        if (index > arr.size - 1 || index < 0) {
            println("IndexOutOfBound")
        } else if (index == 0) {
            deleteFirst()
        } else if (index == arr.size -1){
            delete()
        }
        else{
            for (i in index..< arr.size - 1){
                arr[i] = arr[i+1]
            }
            delete()
        }
    }

    fun print() {
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