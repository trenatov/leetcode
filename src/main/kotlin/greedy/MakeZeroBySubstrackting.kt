package greedy

import Problem

/**
 * https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
 */
class MakeZeroBySubstrackting : Problem {

    fun minimumOperations(nums: IntArray): Int {
        nums.sort()
        var operations = 0

        for (i in nums.indices) {
            val value = nums[i]
            if (value == 0) continue

            for (j in i..nums.lastIndex) {
                nums[j] = nums[j] - value
            }

            operations++
        }

        return operations
    }

    override fun run() {
        println(minimumOperations(intArrayOf(1, 5, 0, 3, 5)))
        println(minimumOperations(intArrayOf(0)))
    }

}
