package tree

import Problem
import java.util.*


/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
class BinaryTrePreorderTraversal : Problem {

    fun preorderTraversal(root: TreeNode?): List<Int> {
        val answer: MutableList<Int> = ArrayList()
        val stack = Stack<TreeNode?>()
        stack.add(root)

        while (!stack.isEmpty()) {
            val currNode = stack.peek()
            stack.pop()
            if (currNode != null) {
                answer.add(currNode.`val`)
                stack.add(currNode.right)
                stack.add(currNode.left)
            }
        }

        return answer
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
            right = TreeNode(3)
        }

    }
}
