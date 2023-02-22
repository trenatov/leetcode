package tree

import Problem
import java.util.*

class BSTIterator(root: TreeNode?) : Problem {

    private val list = LinkedList<Int>()

    init {
        traverse(root)
    }

    private fun traverse(node: TreeNode?) {
        if (node == null) return
        traverse(node.left)
        list.add(node.`val`)
        traverse(node.right)
    }

    fun next(): Int {
        return list.removeFirst()
    }


    fun hasNext(): Boolean {
        return list.isNotEmpty()
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {

    }

}