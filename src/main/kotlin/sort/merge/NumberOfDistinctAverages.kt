package sort.merge

import Problem


/**
 * https://leetcode.com/problems/number-of-distinct-averages/
 */
class NumberOfDistinctAverages : Problem {

    fun distinctAverages(nums: IntArray): Int {
        val averages = mutableSetOf<Double>()
        val sorted = sort(nums.toList())

        for (i in 0..sorted.size / 2) {
            val greatest = sorted[sorted.size - 1 - i]
            val smallest = sorted[i]
            averages.add((greatest + smallest) / 2.0)
        }

        return averages.size
    }

    private fun sort(list: List<Int>): List<Int> {
        if (list.size < 2) return list
        val middle = list.size / 2
        val left = list.subList(0, middle)
        val right = list.subList(middle, list.size)
        return merge(sort(left), sort(right))
    }

    private fun merge(left: List<Int>, right: List<Int>): List<Int> {
        var leftIndex = 0
        var rightIndex = 0
        val result = mutableListOf<Int>()

        while (leftIndex < left.size && rightIndex < right.size) {
            if (left[leftIndex] > right[rightIndex]) {
                result.add(right[rightIndex])
                rightIndex++
            } else if (left[leftIndex] < right[rightIndex]) {
                result.add(left[leftIndex])
                leftIndex++
            } else {
                result.add(left[leftIndex])
                result.add(right[rightIndex])
                leftIndex++
                rightIndex++
            }
        }

        if (leftIndex < left.size) {
            result.addAll(left.subList(leftIndex, left.size))
        }

        if (rightIndex < right.size) {
            result.addAll(right.subList(rightIndex, right.size))
        }

        return result
    }

    override fun run() {
        println(distinctAverages(intArrayOf(4, 1, 4, 0, 3, 5)))
        println(distinctAverages(intArrayOf(1, 100)))
    }

}
