package tree

import Problem


/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 */
class IsSubtree : Problem {

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null) return false
        if (subRoot == null) return false

        if (root.`val` == subRoot.`val` && isSame(root, subRoot)) return true

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }

    private fun isSame(first: TreeNode?, second: TreeNode?): Boolean {
        if (first == null && second == null) return true

        if (first?.`val` != second?.`val`) return false
        return isSame(first?.left, second?.left) && isSame(first?.right, second?.right)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(4).apply {
            left = TreeNode(1)
            right = TreeNode(2).apply {
                left = TreeNode(1)
            }
        }

        val subRoot = TreeNode(4).apply {
            left = TreeNode(1)
            right = TreeNode(2)
        }

        println(isSubtree(root, subRoot))
    }
}
