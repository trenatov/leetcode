package sort.selection

import Problem

/**
 * https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
 */
class MaxProductDifference : Problem {

    fun maxProductDifference(nums: IntArray): Int {
        sort(nums)
        return nums[nums.size - 1] * nums[nums.size - 2] - nums[0] * nums[1]
    }

    private fun sort(nums: IntArray) {
        for (i in nums.indices) {
            var smallest = i
            for (j in i + 1..nums.lastIndex) {
                if (nums[smallest] > nums[j]) smallest = j
            }
            val temp = nums[smallest]
            nums[smallest] = nums[i]
            nums[i] = temp
        }
    }

    override fun run() {
        println(maxProductDifference(intArrayOf(5, 6, 2, 7, 4)))
        println(maxProductDifference(intArrayOf(4, 2, 5, 9, 7, 4, 8)))
    }

}
