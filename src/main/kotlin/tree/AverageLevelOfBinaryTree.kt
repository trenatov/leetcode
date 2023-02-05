package tree

import Problem

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
 */
class AverageLevelOfBinaryTree : Problem {

    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val map = mutableMapOf<Int, MutableList<Long>>()
        traverse(map, root, 0)
        return map.map { it.value }.map { (1.0 * it.sum()) / it.size }.toDoubleArray()
    }

    private fun traverse(map: MutableMap<Int, MutableList<Long>>, node: TreeNode?, h: Int) {
        if (node == null) return

        val list = map.getOrPut(h) { mutableListOf() }
        list.add(node.`val`.toLong())

        traverse(map, node.left, h + 1)
        traverse(map, node.right, h + 1)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root1 = TreeNode(2147483647).apply {
            left = TreeNode(2147483647)
            right = TreeNode(2147483647)
        }

        val result = averageOfLevels(root1)
        println(result)
    }
}
