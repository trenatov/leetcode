package slidingwindow

import Problem

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
class ContainsDuplicateTwo : Problem {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, MutableList<Int>>()

        for (i in nums.indices) {
            val list = map.getOrDefault(nums[i], mutableListOf()).apply { add(i) }
            map[nums[i]] = list

            if (list.size <= 1) continue
            if (isLessThanOrEqual(list, k)) return true
        }

        return false
    }

    private fun isLessThanOrEqual(list: List<Int>, k: Int): Boolean {
        var prev = list[list.size - 1]

        for (i in list.lastIndex - 1 downTo 0) {
            if (prev - list[i] <= k) {
                return true
            }
            prev = list[i]
        }

        return false
    }

    override fun run() {
        println(containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3))
        println(containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1))
        println(containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2))
    }

}
