package tree

import Problem


/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
class SumOfRootToLeafBinaryTree : Problem {

    private var sum = 0

    fun sumRootToLeaf(root: TreeNode?): Int {
        traverse(root, mutableListOf())
        return sum
    }

    private fun traverse(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return

        list.add(node.`val`)

        if (node.left == null && node.right == null) {
            calculateSum(list)
            return
        }


        traverse(node.left, list.toMutableList())
        traverse(node.right, list.toMutableList())
    }

    private fun calculateSum(list: List<Int>) {
        var index = list.size - 1
        var s = 0
        for (i in list.indices) {
            s += Math.pow(2.0, index * 1.0).toInt() * list[i]
            index--
        }

        sum += s
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(1).apply {
            left = TreeNode(0).apply {
                left = TreeNode(0)
                right = TreeNode(1)
            }
            right = TreeNode(1).apply {
                left = TreeNode(0)
                right = TreeNode(1)
            }
        }
        println(sumRootToLeaf(root))
    }
}
