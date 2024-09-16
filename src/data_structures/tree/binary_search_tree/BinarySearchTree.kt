package src.data_structures.tree.binary_search_tree

import src.data_structures.tree.Node

fun main(){
    val tree = BinarySearchTree()
    tree.insert(10)
    tree.insert(9)
    tree.insert(15)
    tree.insert(16)
    tree.insert(1)
    tree.preOrder(tree.root)
    println()
    tree.inOrder(tree.root)
    println()
    tree.postOrder(tree.root)
}
class BinarySearchTree {
    var root : Node? = null


    fun insert(value : Int, node: Node? = root){
        if (root == null){
            root = Node(value)
        }
        
        if (node != null){
            if (value < node.value){
                if (node.left == null){
                    node.left = Node(value)
                }else{
                    insert(value, node.left)
                }
            }else{
                if (node.right == null){
                    node.right = Node(value)
                }else{
                    insert(value, node.right)
                }
            }
        }else return
    }


    //traversal in preorder left to right
    fun preOrder(node: Node?){
        if (node != null){
            print("${node.value} ")
            preOrder(node.left)
            preOrder(node.right)
        }
        else{
            return
        }
    }

    fun inOrder(node : Node?){
        if (node != null){
            preOrder(node.left)
            print("${node.value} ")
            preOrder(node.right)
        }
        else{
            return
        }
    }

    fun postOrder(node : Node?){
        if (node != null){
            preOrder(node.left)
            preOrder(node.right)
            print("${node.value} ")
        }
        else{
            return
        }
    }

}