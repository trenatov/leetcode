package array

import Problem


/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
class CheckIfAtLeastLengthKPlacesAway : Problem {

    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var lastDistance = 0
        var met = false
        for (i in nums.indices) {

            if (nums[i] == 0) {
                lastDistance++
            } else {
                if (i != 0 && lastDistance < k && met) {
                    return false
                }
                met = true

                lastDistance = 0
            }
        }

        return true
    }

    override fun run() {
        println(kLengthApart(intArrayOf(0, 1, 0, 0, 1, 0, 0, 1), 2))
    }

}
