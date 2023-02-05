package tree

import Problem

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
class BinaryTreeLevelOrderTraversal : Problem {

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val map = mutableMapOf<Int, MutableList<Int>>()
        traverse(map, root, 0)
        return map.map { it.value }
    }

    private fun traverse(map: MutableMap<Int, MutableList<Int>>, node: TreeNode?, h: Int) {
        if (node == null) return

        val list = map.getOrPut(h) { mutableListOf() }
        list.add(node.`val`)

        traverse(map, node.left, h + 1)
        traverse(map, node.right, h + 1)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root1 = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }

        val result = levelOrder(root1)
        println(result)
    }
}
