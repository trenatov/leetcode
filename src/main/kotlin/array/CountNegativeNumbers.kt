package array

import Problem


/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
class CountNegativeNumbers : Problem {

    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0

        for (i in grid.indices) {
            count += count(grid[i])
        }

        return count
    }

    private fun count(array: IntArray): Int {
        for (i in array.indices) {
            if (0 > array[i]) {
                return array.size - i
            }
        }
        return 0
    }

    override fun run() {
        println(
            countNegatives(
                arrayOf(
                    intArrayOf(4, 3, 2, -1),
                    intArrayOf(3, 2, 1, -1),
                    intArrayOf(1, 1, -1, -2),
                    intArrayOf(-1, -1, -2, -3)
                )
            )
        )
    }

}
