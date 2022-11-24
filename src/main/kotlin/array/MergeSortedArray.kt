package array

import Problem


/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
class MergeSortedArray : Problem {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var index = 0
        for (i in m until nums1.size) {
            nums1[i] = nums2[index]
            index++
        }
        nums1.sort()
    }

    override fun run() {
        intArrayOf(2, 4, 6, 3, 1)
    }

}
