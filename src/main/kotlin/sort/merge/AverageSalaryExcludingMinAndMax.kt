package sort.merge

import Problem


/**
 * https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
class AverageSalaryExcludingMinAndMax : Problem {

    fun average(salary: IntArray): Double {
        val sorted = sort(salary.toList())

        var sum = 0.0
        for (i in 1 until sorted.lastIndex) {
            sum += sorted[i]
        }

        return sum / (sorted.size - 2)
    }

    private fun sort(list: List<Int>): List<Int> {
        if (list.size < 2) return list

        val middle = list.size / 2
        val left = list.subList(0, middle)
        val right = list.subList(middle, list.size)

        return merge(sort(left), sort(right))
    }

    private fun merge(left: List<Int>, right: List<Int>): List<Int> {
        // 1
        var leftIndex = 0
        var rightIndex = 0
        // 2
        val result = mutableListOf<Int>()
        // 3
        while (leftIndex < left.size && rightIndex < right.size) {
            val leftElement = left[leftIndex]
            val rightElement = right[rightIndex]
            // 4
            if (leftElement < rightElement) {
                result.add(leftElement)
                leftIndex += 1
            } else if (leftElement > rightElement) {
                result.add(rightElement)
                rightIndex += 1
            } else {
                result.add(leftElement)
                leftIndex += 1
                result.add(rightElement)
                rightIndex += 1
            }
        }
        // 5
        if (leftIndex < left.size) {
            result.addAll(left.subList(leftIndex, left.size))
        }
        if (rightIndex < right.size) {
            result.addAll(right.subList(rightIndex, right.size))
        }
        return result
    }

    override fun run() {
        println(average(intArrayOf(4000, 3000, 1000, 2000)))
        println(average(intArrayOf(1000, 2000, 3000)))
    }

}
