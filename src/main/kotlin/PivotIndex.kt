/**
 * https://leetcode.com/problems/find-pivot-index/?envType=study-plan&id=level-1
 */
class PivotIndex : Problem {

    fun pivotIndex(nums: IntArray): Int {
        for (i in nums.indices) {
            val left = leftSum(nums, i)
            val right = rightSum(nums, i)

            if (left == right) return i
        }

        return -1
    }

    private fun leftSum(nums: IntArray, index: Int): Int {
        var sum = 0
        var i = index - 1
        while (i >= 0) {
            sum += nums[i]
            i--
        }
        return sum
    }

    private fun rightSum(nums: IntArray, index: Int): Int {
        var sum = 0
        var i = index + 1
        while (i < nums.size) {
            sum += nums[i]
            i++
        }
        return sum
    }

    override fun run() {
        val nums = intArrayOf(1, 7, 3, 6, 5, 6)
        val nums2 = intArrayOf(1, 2, 3)
        val nums3 = intArrayOf(2, 1, -1)

        println(pivotIndex(nums))
        println(pivotIndex(nums2))
        println(pivotIndex(nums3))
    }

}
