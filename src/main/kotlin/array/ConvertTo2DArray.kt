package array

import Problem


/**
 * https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
 */
class ConvertTo2DArray : Problem {

    fun findMatrix(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<MutableList<Int>>()
        val map = mutableMapOf<Int, Int>()
        var max = 0

        for (n in nums) {
            val count = map.getOrDefault(n, 0) + 1
            map[n] = count
            max = Math.max(max, count)
        }

        repeat(max) {
            val new = mutableListOf<Int>()
            for (e in map) {
                if (e.value != 0) {
                    new.add(e.key)
                    map[e.key] = e.value - 1
                }
            }
            ans.add(new)
        }

        return ans
    }

    override fun run() {
        println(findMatrix(intArrayOf(1, 3, 4, 1, 2, 3, 1)))
        println(findMatrix(intArrayOf(1, 2, 3, 4)))
    }

}
