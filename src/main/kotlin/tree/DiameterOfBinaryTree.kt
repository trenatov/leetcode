package tree

import Problem

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
class DiameterOfBinaryTree : Problem {

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        var ans = 0
        fun dfs(root: TreeNode?): Int {
            if (root == null) return 0
            val l = dfs(root.left)
            val r = dfs(root.right)
            ans = maxOf(ans, l + r)
            return maxOf(l, r) + 1
        }
        dfs(root)
        return ans
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
            right = TreeNode(3)
        }

        println(diameterOfBinaryTree(root))
    }
}
