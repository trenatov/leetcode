package array

import Problem


/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
class KLargestElementInArray : Problem {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        nums.sort()
        return nums[nums.size - k]
    }

    override fun run() {
        intArrayOf(3, 2, 1, 5, 6, 4)
    }

}
