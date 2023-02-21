package tree

import Problem


/**
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 */
class CountGoodNodes : Problem {

    private var count = 0

    fun goodNodes(root: TreeNode?): Int {
        traverse(root, root!!.`val`)
        return count
    }

    private fun traverse(node: TreeNode?, max: Int) {
        if (node == null) return
        if (node.`val` >= max) count++

        val newMax = Math.max(max, node.`val`)

        traverse(node.left, newMax)
        traverse(node.right, newMax)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(3).apply {
            left = TreeNode(1).apply {
                left = TreeNode(3)
            }

            right = TreeNode(4).apply {
                left = TreeNode(1)
                right = TreeNode(5)
            }
        }

        println(goodNodes(root))
    }
}
