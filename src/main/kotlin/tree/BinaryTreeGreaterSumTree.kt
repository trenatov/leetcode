package tree

import Problem


/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
class BinaryTreeGreaterSumTree : Problem {

    private var sum = 0

    fun bstToGst(root: TreeNode?): TreeNode? {
        if (root == null) return root

        bstToGst(root.right)

        sum += root.`val`
        root.`val` = sum

        bstToGst(root.left)
        return root
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(4).apply {
            right = TreeNode(6).apply {
                left = TreeNode(5)
                right = TreeNode(7).apply {
                    right = TreeNode(8)
                }
            }
            left = TreeNode(1)
        }

        val bstToGst = bstToGst(root)
        println(bstToGst)
    }
}
