package array

import Problem


/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
class FindAllDisappearedNumbers : Problem {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val result: MutableList<Int> = ArrayList()

        for (element in nums) {
            val value = Math.abs(element) - 1
            if (nums[value] > 0) nums[value] = -nums[value]
        }

        for (i in nums.indices) if (nums[i] > 0) result.add(i + 1)
        return result
    }

    override fun run() {
        println(findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
    }

}
