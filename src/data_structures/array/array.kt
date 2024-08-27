import kotlin.Array

// Array basic operations
//insertion, deletion, replace, gettingValueIndex

class Array{

    private val arr : Array<Int> = arrayOf(1,2,3,4,5)

    fun insert(index : Int, value : Int){
        if (index == arr.size)
            arr += value
        else if (index == 0)
            arr.set()

    }
}

fun main() {
    val array = Array()
    array.insert(5, 9)
}