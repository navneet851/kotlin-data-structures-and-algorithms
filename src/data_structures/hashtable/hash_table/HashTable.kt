package src.data_structures.hashtable.hash_table


fun main(){
    val hashTable = HashTable(8)
    hashTable.print()
}
class HashTable(private val size : Int) {
    private val hashTable : Array<KeyValue?> = arrayOfNulls<KeyValue>(5)


    fun print(){
        println(" Index |        Key         |        value      |")
        println("---------------------------------")
        for(i in hashTable.indices){
            println("|  $i   |  ${hashTable[i]?.key}  | ${hashTable[i]?.value}  |")
        }
    }


}