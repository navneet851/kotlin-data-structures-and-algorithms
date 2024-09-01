package src.data_structures.stack

fun main(){
    val stack = Stack()
    println(stack.isEmpty())
    stack.push(4)
    stack.push(6)
    stack.push(7)
    stack.push(8)
    stack.pop()
    println("peek is " + stack.peek())
    println(stack.isEmpty())
    println()
    stack.print()
}
class Stack {
    private var stack : Array<Int> = emptyArray()

    fun isEmpty() = stack.size == 0

    fun peek() = if (isEmpty()) 0 else stack[stack.size - 1]

    //push value in stack
    fun push(value : Int){
        stack += value
    }

    //remove value from top
    fun pop(){
        if (isEmpty()){
            println("!!!!!!!! Stack underflow !!!!!!!!!")
        }
        else{
            val newArr = stack.copyOf(stack.size - 1)
            stack = newArr.filterNotNull().toTypedArray()
        }
    }

    fun print(){
        println("|       | <- top(peek)")
        for (i in stack.size - 1 downTo 0){
            println("|   ${stack[i]}   |")
            println("|-------|")
        }

    }


}