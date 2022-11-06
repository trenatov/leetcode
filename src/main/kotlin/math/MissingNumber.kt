package math

import Problem


/**
 * https://leetcode.com/problems/missing-number/
 */
class MissingNumber : Problem {

    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        var totalsum = n * (n + 1) / 2
        for (i in nums) totalsum -= i
        return totalsum
    }

    override fun run() {

    }

}
