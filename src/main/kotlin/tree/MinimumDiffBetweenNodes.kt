package tree

import Problem

/**
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 */
class MinimumDiffBetweenNodes : Problem {

    fun minDiffInBST(root: TreeNode?): Int {
        val list = mutableListOf<Int>()
        buildList(root, list)
        list.sort()
        var min = Int.MAX_VALUE

        for (i in 0 until list.lastIndex) {
            for (j in i + 1..list.lastIndex) {
                if (list[j] - list[i] < min) {
                    min = list[j] - list[i]
                }
            }
        }

        return min
    }

    private fun buildList(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return
        list.add(node.`val`)

        buildList(node.left, list)
        buildList(node.right, list)
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

    }

}
