package src.data_structures.hashtable.hash_table

import kotlin.math.absoluteValue


fun main() {
    val hashTable = HashTable<String, Int>(5)
    hashTable.put("green", 5)
    hashTable.put("orange", 1)
    hashTable.put("orange", -1)
    hashTable.put("math", 9)
    hashTable.put("green", 5)

    hashTable.search("orange")
    hashTable.print()
}

class HashTable<K, V>(private val size: Int) {
    private val hashTable: Array<KeyValue<K, V>?> = arrayOfNulls<KeyValue<K, V>>(size)


    private fun hash(key: K): Int {
        print(key)
        print("  ${key.hashCode()}    ")
        print((key.hashCode() % hashTable.size).absoluteValue)
        println()
        return (key.hashCode() % hashTable.size).absoluteValue
    }

    fun put(key: K, value: V) {
        val index = hash(key)
        if (hashTable[index] == null) {
            hashTable[index] = KeyValue(key, value)
        }
        else {
            var start = index
            var end = hashTable.size
            if (index == hashTable.size - 1){
                start = 0
                end = index
            }

            while (start < end && hashTable[start] != null) {
                start++
            }

            if (start == index){
                println("table overflow")
            }
            else{
                hashTable[start] = KeyValue(key, value)
            }
        }
    }

    fun search(key: K) {
        val index = hash(key)
        if (hashTable[index] == null) {
            println("key is not present in table")
        } else if (hashTable[index]?.key == key) {
            println("value of key $key is ${hashTable[index]?.value}")
        } else {
            var i = index
            while (i < hashTable.size && hashTable[i]?.key != key) {
                i++
            }
            if (i == hashTable.size) {
                println("key is not present in table **")
            } else {
                println("value of key $key is ${hashTable[i]?.value} **")
            }

        }
    }

    fun print() {
        println()
        println("--------------------------------------------------")
        println("| Index |        Key         |        value      |")
        println("--------------------------------------------------")
        for (i in hashTable.indices) {
            println("|   $i   |        ${hashTable[i]?.key}        |         ${hashTable[i]?.value}      |")
        }
        println("--------------------------------------------------")
    }


}