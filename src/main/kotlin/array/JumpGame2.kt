package array

import Problem


/**
 * https://leetcode.com/problems/jump-game-ii/
 */
class JumpGame2 : Problem {

    fun jump(nums: IntArray): Int {
        var answer = 0
        val n: Int = nums.size
        var curEnd = 0
        var curFar = 0

        for (i in 0 until n - 1) {
            curFar = Math.max(curFar, i + nums[i])
            if (i == curEnd) {
                answer++
                curEnd = curFar
            }
        }

        return answer
    }

    override fun run() {
        intArrayOf(2, 4, 6, 3, 1)
    }

}
