package array

import Problem


/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
class ConcatenationArray : Problem {

    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(nums.size * 2)
        for (i in nums.indices) {
            ans[i] = nums[i]
        }
        for (i in nums.size until ans.size) {
            ans[i] = nums[i - nums.size]
        }
        return ans
    }

    override fun run() {
        println(getConcatenation(intArrayOf(1, 3, 2, 1)).toList())
    }

}
