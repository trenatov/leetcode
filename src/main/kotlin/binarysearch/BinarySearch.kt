package binarysearch

import Problem

/**
 * https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i
 */
class BinarySearch : Problem {

    fun binarySearch(nums: IntArray, target: Int): Int = search(nums, 0, nums.size - 1, target)

    private fun search(nums: IntArray, first: Int, last: Int, target: Int): Int {
        if (last >= first) {
            val mid: Int = first + (last - first) / 2
            if (nums[mid] == target) {
                return mid
            }
            return if (nums[mid] > target) {
                search(nums, first, mid - 1, target)
            } else {
                search(nums, mid + 1, last, target)
            }
        }
        return -1
    }

    override fun run() {
        val array1 = intArrayOf(-1, 0, 3, 5, 9, 12)
        val array2 = intArrayOf(-1, 0, 3, 5, 9, 12)

        println(binarySearch(array1, 9))
        println(binarySearch(array2, 2))
    }

}
