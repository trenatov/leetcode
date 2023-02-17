package array

import Problem


/**
 * https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/
 */
class CountNumberOfPairsInArray : Problem {

    fun countKDifference(nums: IntArray, k: Int): Int {
        var count = 0

        for (i in 0 until nums.lastIndex) {
            for (j in i + 1..nums.lastIndex) {
                val diff = Math.abs(nums[i] - nums[j])

                if (diff == k) count++
            }
        }

        return count
    }

    override fun run() {

    }

}
