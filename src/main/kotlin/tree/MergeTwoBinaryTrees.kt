package tree

import Problem

/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
class MergeTwoBinaryTrees : Problem {

    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        val root = TreeNode(resolve(root1, root2)?.`val` ?: 0)

        return merge(root, root1, root2)
    }

    fun merge(current: TreeNode?, root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null) return null

        current?.left = resolve(root1?.left, root2?.left)
        merge(current?.left, root1?.left, root2?.left)

        current?.right = resolve(root1?.right, root2?.right)
        merge(current?.right, root1?.right, root2?.right)

        return current
    }

    private fun resolve(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        return if (root1 != null && root2 != null) {
            TreeNode(root1.`val` + root2.`val`)
        } else if (root1 != null) {
            TreeNode(root1.`val`)
        } else if (root2 != null) {
            TreeNode(root2.`val`)
        } else {
            null
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root1 = TreeNode(1).apply {
            left = TreeNode(3).apply {
                left = TreeNode(5)
            }
            right = TreeNode(2)
        }

        val root2 = TreeNode(2).apply {
            left = TreeNode(1).apply {
                right = TreeNode(4)
            }
            right = TreeNode(3).apply {
                right = TreeNode(7)
            }
        }

        val result = mergeTrees(root1, root2)
        println(result)
    }
}
