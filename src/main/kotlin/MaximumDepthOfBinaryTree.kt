/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
class MaximumDepthOfBinaryTree : Problem {

    fun maxDepth(root: TreeNode?): Int {
        if (null == root) return 0

        return countDepth(root, 1)
    }

    private fun countDepth(root: TreeNode?, count: Int): Int {
        if (root == null) return count - 1

        val left = countDepth(root.left, count + 1)
        val right = countDepth(root.right, count + 1)

        return if (left > right) left else right
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        println(maxDepth(root))
    }

}
