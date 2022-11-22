package tree

import Problem

/**
 * https://leetcode.com/problems/deepest-leaves-sum/
 */
class DeepestLeavesSum : Problem {

    fun deepestLeavesSum(root: TreeNode?): Int {
        val max = countDepth(root, 1)
        return sum(root, max - 1)
    }

    private fun countDepth(root: TreeNode?, count: Int): Int {
        if (root == null) return count - 1

        val left = countDepth(root.left, count + 1)
        val right = countDepth(root.right, count + 1)

        return if (left > right) left else right
    }

    private fun sum(node: TreeNode?, count: Int): Int {
        if (node == null) return 0
        if (count == 0) return node.`val`


        val left = sum(node.left, count - 1)
        val right = sum(node.right, count - 1)

        return left + right
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(1).apply {
            right = TreeNode(2).apply {
                left = TreeNode(3)
            }
        }

        println(deepestLeavesSum(root))
    }

}
