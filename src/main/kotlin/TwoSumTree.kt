/**
 * https://leetcode.com/problems/palindrome-number/
 */
class TwoSumTree : Problem {

    fun findTarget(root: TreeNode?, k: Int): Boolean {

        val list = mutableListOf<Int>()
        iterate(root, list)
        return twoSum(list, k)
    }


    fun iterate(node: TreeNode?, list: MutableList<Int>) {
        if (node == null) return
        list.add(node.`val`)

        iterate(node.left, list)
        iterate(node.right, list)
    }

    fun twoSum(nums: MutableList<Int>, target: Int): Boolean {
        for (index in nums.indices) {
            for (i in index + 1 until nums.size) {
                val first = nums[index]
                val second = nums[i]

                if (first + second == target) {
                    return true
                }
            }
        }
        return false
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    override fun run() {
        val root = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2)
                right = TreeNode(4)
            }

            right = TreeNode(6).apply {
                right = TreeNode(7)
            }
        }

        println(findTarget(root, 9))
    }

}
