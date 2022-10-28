package tree

import Problem

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
class PathSum : Problem {

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        return calculate(root, mutableListOf(), targetSum)
    }

    private fun calculate(node: TreeNode?, path: MutableList<Int>, target: Int): Boolean {
        if (node == null) return false

        val new = path.toMutableList()
        new.add(node.`val`)

        if (node.left == null && node.right == null) {
            if (new.sum() == target) {
                return true
            }

            return false
        } else {
            return calculate(node.left, new, target) || calculate(node.right, new, target)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(5).apply {
            left = TreeNode(4)
            right = TreeNode(8)
        }
    }
}
