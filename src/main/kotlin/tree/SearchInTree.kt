package tree

import Problem

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
class SearchInTree : Problem {

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null
        if (root.`val` == `val`) return root

        return searchBST(root.left, `val`) ?: searchBST(root.right, `val`)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root1 = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        val root2 = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(4)
        }
    }
}
