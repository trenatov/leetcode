package sort.merge

import Problem

/**
 * https://leetcode.com/problems/sort-an-array/
 */
class SortArray : Problem {

    fun sortArray(nums: IntArray): IntArray {
        val result = sort(nums.toList())
        return result.toIntArray()
    }

    private fun sort(list: List<Int>): List<Int> {
        if (list.size < 2) return list
        val middle = list.size / 2
        val left = list.subList(0, middle)
        val right = list.subList(middle, list.size)
        return merge(sort(left), sort(right))
    }

    private fun merge(left: List<Int>, right: List<Int>): List<Int> {
        val merged = mutableListOf<Int>()
        var leftIndex = 0
        var rightIndex = 0

        while (leftIndex < left.size && rightIndex < right.size) {
            if (left[leftIndex] < right[rightIndex]) {
                merged.add(left[leftIndex])
                leftIndex++
            } else if (left[leftIndex] > right[rightIndex]) {
                merged.add(right[rightIndex])
                rightIndex++
            } else {
                merged.add(left[leftIndex])
                merged.add(right[rightIndex])
                rightIndex++
                leftIndex++
            }
        }
        if (leftIndex < left.size) {
            merged.addAll(left.subList(leftIndex, left.size))
        }

        if (rightIndex < right.size) {
            merged.addAll(right.subList(rightIndex, right.size))
        }

        return merged
    }

    override fun run() {
        println(sortArray(intArrayOf(5, 2, 3, 1)).toList())
        println(sortArray(intArrayOf(5, 1, 1, 2, 0, 0)).toList())
    }

}
