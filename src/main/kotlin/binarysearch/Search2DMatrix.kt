package binarysearch

import Problem

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
class Search2DMatrix : Problem {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (m in matrix) {
            val last = m[m.size - 1]
            if (last == target) return true
            if (last > target) return search(m, target, 0, m.size - 1)
        }

        return false
    }

    private fun search(array: IntArray, target: Int, left: Int, right: Int): Boolean {
        val midIndex = left + (right - left) / 2

        val mid = array[midIndex]

        if ((midIndex == right || midIndex == left) && mid != target) return false

        return if (mid == target) {
            return true
        } else if (mid < target) {
            search(array, target, midIndex + 1, right)
        } else {
            search(array, target, left, midIndex - 1)
        }
    }

    override fun run() {
        val row1 = intArrayOf(1, 3, 5)
        //val row2 = intArrayOf(10, 11, 16, 20)
       // val row3 = intArrayOf(23, 30, 34, 60)

        println(searchMatrix(arrayOf(row1), 1))
    }

}
