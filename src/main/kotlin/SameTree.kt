/**
 * https://leetcode.com/problems/same-tree/
 */
class SameTree : Problem {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return isIdentical(p, q)
    }

    fun isIdentical(first: TreeNode?, second: TreeNode?): Boolean {
        if (first == null && second == null) return true

        if (first?.`val` != second?.`val`) return false

        val left = isIdentical(first?.left, second?.left)
        val right = isIdentical(first?.right, second?.right)

        return if (left && right) return true else false
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

        println(isSameTree(root1, root2))
    }
}
