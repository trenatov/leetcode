package tree

import Problem

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
class PathSum2 : Problem {

    fun pathSum(root: TreeNode?, targetSum: Int): List<List<Int>> {
        if (root == null) return emptyList()
        val results = mutableListOf<List<Int>>()

        calculate(root, results, mutableListOf(), targetSum)

        return results
    }

    private fun calculate(node: TreeNode?, answer: MutableList<List<Int>>, path: MutableList<Int>, target: Int) {
        if (node == null) return

        val new = path.toMutableList()
        new.add(node.`val`)

        if (node.left == null && node.right == null) {
            if (new.sum() == target) {
                answer.add(new)
            }

        } else {
            calculate(node.left, answer, new, target)
            calculate(node.right, answer, new, target)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(5).apply {
            left = TreeNode(4)
            right = TreeNode(8)
        }

        println(pathSum(root, 9))
    }
}
