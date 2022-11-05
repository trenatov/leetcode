package array

import Problem


/**
 * https://leetcode.com/problems/jump-game/
 */
class JumpGame : Problem {

    fun canJump(nums: IntArray): Boolean {
        var last: Int = nums.size - 1

        for (i in nums.size - 1 downTo 0) {
            if (i + nums[i] >= last) {
                last = i
            }
        }
        return last == 0
    }

    override fun run() {
        intArrayOf(2, 4, 6, 3, 1)
    }

}
