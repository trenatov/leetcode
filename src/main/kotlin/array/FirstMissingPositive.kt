package array

import Problem


/**
 * https://leetcode.com/problems/first-missing-positive/
 */
class FirstMissingPositive : Problem {

    fun firstMissingPositive(nums: IntArray): Int {
        val check = 0
        val set = nums.toHashSet()
        for (i in 1..nums.size + 1) {
            if (!set.contains(i)) {
                return i
            }
        }
        return 1
    }

    override fun run() {
        intArrayOf(2, 4, 6, 3, 1)
    }

}
