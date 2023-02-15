package array

import Problem


/**
 * https://leetcode.com/problems/intersection-of-multiple-arrays/
 */
class IntersectionOfMultipleArrays : Problem {

    fun intersection(nums: Array<IntArray>): List<Int> {
        val answer = mutableListOf<Int>()

        for (i in nums[0].indices) {
            if (intersectsAll(nums, nums[0][i])) answer.add(nums[0][i])
        }

        return answer.sorted()
    }

    private fun intersectsAll(nums: Array<IntArray>, value: Int): Boolean {
        for (j in 1..nums.lastIndex) {
            if (!nums[j].contains(value)) return false
        }

        return true
    }

    override fun run() {
        intArrayOf(2, 4, 6, 3, 1)
    }

}
