package array

import Problem


/**
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */
class KDiffPairsInArray : Problem {

    fun findPairs(nums: IntArray, k: Int): Int {
        val map: MutableMap<Int, Int> = mutableMapOf()
        for (num in nums) map[num] = map.getOrDefault(num, 0) + 1

        var result = 0
        for (i in map.keys) if (k > 0 && map.containsKey(i + k) || k == 0 && map[i]!! > 1) result++
        return result
    }

    override fun run() {
        println(findPairs(intArrayOf(3, 1, 4, 1, 5), 2))
        println(findPairs(intArrayOf(1, 2, 3, 4, 5), 1))
        println(findPairs(intArrayOf(1, 3, 1, 5, 4), 0))
    }

}
