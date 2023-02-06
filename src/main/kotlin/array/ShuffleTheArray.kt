package array

import Problem


/**
 * https://leetcode.com/problems/shuffle-the-array/
 */
class ShuffleTheArray : Problem {

    fun shuffle(nums: IntArray, n: Int): IntArray {
        val answer = IntArray(2 * n)
        var index = 0
        for (i in 0 until n) {
            answer[index] = nums[i]
            index++
            answer[index] = nums[i + n]
            index++
        }

        return answer
    }

    override fun run() {
        println(shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3).toList())
        println(shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4).toList())
        println(shuffle(intArrayOf(1, 1, 2, 2), 2).toList())
    }

}
