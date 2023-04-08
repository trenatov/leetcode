package array

import Problem


/**
 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
 */
class ArrayIntersection : Problem {

    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = nums1.toSet()
        val set2 = nums2.toSet()
        val first = mutableListOf<Int>()
        val second = mutableListOf<Int>()

        for (i in set1) {
            if (!set2.contains(i)) {
                first.add(i)
            }
        }
        for (i in set2) {
            if (!set1.contains(i)) {
                second.add(i)
            }
        }

        return listOf(first, second)
    }

    override fun run() {
    }

}
