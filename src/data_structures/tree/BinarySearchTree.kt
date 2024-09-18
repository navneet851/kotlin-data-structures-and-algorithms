package src.data_structures.tree

// In Binary Search Tree, the left child of a node contains a value less than the node and the right child
// of a node contains a value greater than the node.
fun main(){
    val tree = BinarySearchTree()
    tree.insert(10)
    tree.insert(9)
    tree.insert(15)
    tree.insert(16)
    tree.insert(1)
    tree.search(15)
    tree.preOrder(tree.root)
    println("-> PreOrder")
    tree.inOrder(tree.root)
    println("-> InOrder")
    tree.postOrder(tree.root)
    println("-> PostOrder")
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

    //to check value is present in tree or not
    fun search(value: Int){
        var node = root
        while (node != null){
            if (node.value == value){
                println("Value found")
                return
            }else if (value < node.value){
                node = node.left
            }else{
                node = node.right
            }
        }
        println("Value not found")
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