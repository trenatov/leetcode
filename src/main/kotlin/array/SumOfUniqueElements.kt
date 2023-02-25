package array

import Problem


/**
 * https://leetcode.com/problems/sum-of-unique-elements/
 */
class SumOfUniqueElements : Problem {

    fun sumOfUnique(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()

        for (n in nums) {
            val count = map.getOrDefault(n, 0)
            map[n] = count + 1
        }

        return map.filter { it.value == 1 }.keys.sum()
    }

    override fun run() {
        println(sumOfUnique(intArrayOf(1, 2, 3, 2)))
    }

}
