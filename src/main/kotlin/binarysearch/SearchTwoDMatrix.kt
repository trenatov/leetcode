package binarysearch

import Problem

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */
class SearchTwoDMatrix : Problem {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (i in matrix.indices) {
            if (exists(matrix[i], 0, matrix[i].size - 1, target)) return true
        }
        return false
    }

    private fun exists(nums: IntArray, first: Int, last: Int, target: Int): Boolean {
        if (last >= first) {
            val mid: Int = first + (last - first) / 2
            if (nums[mid] == target) {
                return true
            }
            return if (nums[mid] > target) {
                exists(nums, first, mid - 1, target)
            } else {
                exists(nums, mid + 1, last, target)
            }
        }
        return false
    }

    override fun run() {

    }

}
