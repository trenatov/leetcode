package tree

import Problem


/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
class MinDepthOfBinaryTree : Problem {

    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val left: Int = minDepth(root.left)
        val right: Int = minDepth(root.right)

        return if (left == 0 || right == 0) left + right + 1 else Math.min(left, right) + 1
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
    }

}
