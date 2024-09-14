package src.data_structures.hashtable.kotlin_map


fun main(){
    val map = Map()
    map.add("bar", 4)
    map.remove("nav")
    map.print()
}
class Map {
    private var map = mutableMapOf<String, Int>("nav" to  3)


    fun add(key : String, value : Int){
        map.put(key, value)
    }

    fun remove(key : String){
        map.remove(key)
    }

    fun print(){
        println(map)
    }
}