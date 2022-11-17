package array

import Problem


/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
class NumberSmallerThanCurrent : Problem {

    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val answ = IntArray(nums.size)

        for (index in nums.indices) {
            var count = 0
            for (i in nums.indices) {
                if (i != index && nums[index] > nums[i]) {
                    count++
                }
            }
            answ[index] = count
        }
        return answ
    }

    override fun run() {
        println(smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).toList())
    }

}
