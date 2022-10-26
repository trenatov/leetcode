package tree

import Problem

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
class BalancedBinaryTree : Problem {

    fun isBalanced(root: TreeNode?): Boolean {
        return when {
            root == null -> true
            else -> Math.abs(depth(root.right) - depth(root.left)) <= 1 &&
                    isBalanced(root.left) &&
                    isBalanced(root.right)
        }
    }

    fun depth(root: TreeNode?): Int = when (root) {
        null -> 0
        else -> 1 + maxOf(depth(root.right), depth(root.left))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root1 = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        val root2 = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(4)
        }


    }
}
