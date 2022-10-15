package tree

import Problem

/**
 * https://leetcode.com/problems/symmetric-tree/
 */
class SymmetricTree : Problem {

    fun isSymmetric(root: TreeNode?): Boolean {
        return isSymmetric(root?.left, root?.right)
    }

    fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true

        if (left?.`val` != right?.`val`) return false

        val isLeftSymmetric = isSymmetric(left?.right, right?.left)
        val isRightSymmetric = isSymmetric(left?.left, right?.right)

        return if (isLeftSymmetric && isRightSymmetric) return true else false
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        println(isSymmetric(root))
    }
}
