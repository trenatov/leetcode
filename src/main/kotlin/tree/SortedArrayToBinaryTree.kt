package tree

import Problem


/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
class SortedArrayToBinaryTree : Problem {

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return build(nums, 0, nums.size - 1)
    }

    private fun build(nums: IntArray, left: Int, right: Int): TreeNode? {
        if (left > right) return null
        val m = (right + left) / 2
        val root = TreeNode(nums[m])
        root.left = build(nums, left, m - 1)
        root.right = build(nums, m + 1, right)
        return root
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val r = sortedArrayToBST(intArrayOf(0, 1, 2, 3, 4, 5))
        println(r)
    }
}
