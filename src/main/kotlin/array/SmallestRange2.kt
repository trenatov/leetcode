package array

import Problem


/**
 * https://leetcode.com/problems/smallest-range-ii/description/
 */
class SmallestRange2 : Problem {

    fun smallestRangeII(nums: IntArray, k: Int): Int {
        val n = nums.size
        nums.sort()
        var ans = nums[n - 1] - nums[0]

        for (i in 0 until nums.size - 1) {
            val a: Int = nums[i]
            val b: Int = nums[i + 1]
            val high = Math.max(nums[n - 1] - k, a + k)
            val low = Math.min(nums[0] + k, b - k)
            ans = Math.min(ans, high - low)
        }
        return ans
    }

    override fun run() {
    }

}
