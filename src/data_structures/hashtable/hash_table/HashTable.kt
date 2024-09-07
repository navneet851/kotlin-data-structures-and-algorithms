package src.data_structures.hashtable.hash_table

import kotlin.math.absoluteValue


fun main(){
    val hashTable = HashTable<String, Int>(5)
    hashTable.put("apple", 5)
    hashTable.put("orange", 1)
    hashTable.put("papaya", 4)
    hashTable.put("banana", 3)
    hashTable.put("kiwi", 8)
    hashTable.print()
}
class HashTable<K, V>(private val size : Int) {
    private val hashTable : Array<KeyValue<K, V>?> = arrayOfNulls<KeyValue<K, V>>(size)


    private fun hash(key : K) : Int{
        println(key.hashCode())
        return (key.hashCode() % hashTable.size).absoluteValue
    }

    fun put(key : K, value : V){
        val index = hash(key)
        if (hashTable[index] == null){
            hashTable[index] = KeyValue(key, value)
        }
        else{
            var i = index
            while (i < hashTable.size && hashTable[i] != null){
                i++
            }
            if (i == hashTable.size){
                println("table overflow")
            }
            else{
                hashTable[i] = KeyValue(key, value)
            }

        }
    }

    fun print(){
        println("| Index |        Key         |        value      |")
        println("--------------------------------------------------")
        for(i in hashTable.indices){
            println("|   $i   |        ${hashTable[i]?.key}        |         ${hashTable[i]?.value}      |")
        }
    }


}