package array

import Problem


/**
 * https://leetcode.com/contest/weekly-contest-333/problems/merge-two-2d-arrays-by-summing-values/
 */
class MergeTwoDArrayById : Problem {

    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val map = mutableMapOf<Int, Int>()

        nums1.map {
            map[it[0]] = it[1]
        }

        nums2.map {
            val existing = map.getOrDefault(it[0], 0)
            map[it[0]] = existing + it[1]
        }

        return map.toSortedMap().map { intArrayOf(it.key, it.value) }.toTypedArray()

    }

    override fun run() {
    }

}
