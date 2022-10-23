package tree

import Problem

/**
 * https://leetcode.com/problems/invert-binary-tree/
 */
class InvertTree : Problem {

    fun invertTree(root: TreeNode?): TreeNode? {
        invert(root)
        return root
    }

    private fun invert(node: TreeNode?) {
        if (node == null) return

        val right = node.right
        val left = node.left

        node.right = left
        node.left = right

        invert(node.right)
        invert(node.left)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {

    }
}
