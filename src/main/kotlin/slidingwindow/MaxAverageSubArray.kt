package slidingwindow

import Problem

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */
class MaxAverageSubArray : Problem {

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var max: Double
        var prev: Double

        var sum = 0.0
        for (i in 0 until k) {
            sum += nums[i]
        }

        max = sum / k
        for (i in k until nums.size) {
            sum = sum - nums[i - k] + nums[i]
            prev = sum / k

            if (prev > max) {
                max = prev
            }
        }

        return max
    }

    override fun run() {
        println(findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4))
        println(findMaxAverage(intArrayOf(5), 1))
    }

}
