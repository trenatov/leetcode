package tree

import Problem


/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
class ValidateBinarySearchTree : Problem {

    fun isValidBST(root: TreeNode?): Boolean {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private fun isValidBST(node: TreeNode?, minVal: Long, maxVal: Long): Boolean {
        if (node == null) return true
        if (node.`val` >= maxVal || node.`val` <= minVal) return false

        return isValidBST(node.left, minVal, node.`val`.toLong()) && isValidBST(node.right, node.`val`.toLong(), maxVal)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root1 = TreeNode(2147483647).apply {
            left = TreeNode(2147483647)
            right = TreeNode(2147483647)
        }

    }
}
