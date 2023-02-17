package greedy

import Problem


/**
 * https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
 */
class MinOperationsToMakeTheArray : Problem {

    fun minOperations(nums: IntArray): Int {
        var operations = 0
        var prev = nums[0]
        for (n in 1..nums.lastIndex) {
            if (nums[n] <= prev) {
                operations += prev - nums[n] + 1
                prev += 1
            } else {
                prev = nums[n]
            }
        }

        return operations
    }

    override fun run() {
        println(minOperations(intArrayOf(1, 1, 1)))
        println(minOperations(intArrayOf(1, 5, 2, 4, 1)))
        println(minOperations(intArrayOf(8)))
    }

}
