package src.data_structures.hashtable.hash_table

import kotlin.math.absoluteValue


fun main() {
    //for generic type String

    val hashTable = HashTable<String, Int>(5)
    hashTable.put("orange", -11)
    hashTable.put("green", 5)
    hashTable.put("banana", 5)
    hashTable.remove("green")
    hashTable.put("green", 0)
    hashTable.put("bananaa", -22)
    hashTable.search("bananaa")


    //for generic type Integer

//    val hashTable = HashTable<Int, Int>(5)
//    hashTable.put(1011, -1)
//    hashTable.put(2223, -1)
//    hashTable.put(3332, -3)
//    hashTable.remove(2223)
//    hashTable.put(2226, -3)
//    hashTable.search(2226)



    hashTable.print()
}

class HashTable<K, V>(private val size: Int) {
    private val hashTable: Array<KeyValue<K, V>?> = arrayOfNulls<KeyValue<K, V>>(size)


    // return an index from given key after performing mathematical operation
    private fun hash(key: K): Int {
        print(key)
        print("  ${key.hashCode()}    ")
        print((key.hashCode() % hashTable.size).absoluteValue)
        println()
        return (key.hashCode() % hashTable.size).absoluteValue
    }


    // add the corresponding free space on deleted index as its datatype
    private fun removedKey(key: K): Any? {
        val type = (key!!::class).toString()
        return when (type){
            "class java.lang.String (Kotlin reflection is not available)" -> "empty"
            "class java.lang.Integer (Kotlin reflection is not available)" -> 0
            else -> null
        }
    }


    // put elements in table on there hash index,
    // if already occupied then find next empty space using linear probing.
    fun put(key: K, value: V) {
        print("put ")
        val index = hash(key)
        if (hashTable[index] == null || hashTable[index]?.key == removedKey(key)) {
            hashTable[index] = KeyValue(key, value)
        } else {
            var start = index
            var end = hashTable.size
            if (index == hashTable.size - 1) {
                start = 0
                end = index
            }

            while (start < end && (hashTable[start] != null && hashTable[start]?.key != removedKey(key))) {
                start++
            }

            if (start == index) {
                println("table overflow")
            } else {
                hashTable[start] = KeyValue(key, value)
            }
        }
    }


    // search element and return its value using hash function,
    // if value not found on index then find it in next indexs till,
    // value is found or null is detected.
    fun search(key: K) {
        val index = hash(key)
        if (hashTable[index] == null) {
            println("key is not present in table")
        } else if (hashTable[index]?.key == key) {
            println("value of key $key is ${hashTable[index]?.value}")
        } else {
            var i = index
            while (i < hashTable.size && hashTable[i]?.key != key ) {
                i++
            }
            if (i == hashTable.size) {
                println("key is not present in table **")
            } else {
                println("value of key $key is ${hashTable[i]?.value} **")
            }

        }
    }


    // remove value from index using key,
    // and put empty or 0 on that free space for further use.
    fun remove(key: K) {
        print("remove ")
        val index = hash(key)
        if (hashTable[index] == null) {
            println("key is not present in table")
        } else if (hashTable[index]?.key == key) {
            hashTable[index] = KeyValue(removedKey(key) as K, null as V)
            println("key $key is removed")
        } else {
            var start = index
            var end = hashTable.size
            if (index == hashTable.size - 1) {
                start = 0
                end = index
            }

            while (start < end && hashTable[start] != null) {
                start++
            }

            if (start == index) {
                println("table overflow")
            } else {
                hashTable[start] = null
                println("key $key is removed")
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