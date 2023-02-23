package tree

import Problem


/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
class ConstructStringFromBinaryTree : Problem {

    private var builder = StringBuilder()

    fun tree2str(root: TreeNode?): String {
        traverse(root)
        return builder.toString()
    }

    private fun traverse(node: TreeNode?) {
        if (node == null) return

        builder.append(node.`val`)

        if (node.left == null && node.right == null) return

        if (node.left != null) {
            builder.append("(")
            traverse(node.left)
            builder.append(")")
        } else {
            builder.append("()")
        }

        if (node.right != null) {
            builder.append("(")
            traverse(node.right)
            builder.append(")")
        } else {
            builder.append("()")
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(1).apply {
            left = TreeNode(2).apply {
                right = TreeNode(4)
            }
            right = TreeNode(3)
        }

        println(tree2str(root))
    }
}
