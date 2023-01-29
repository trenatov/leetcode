package sort.selection

import Problem

/**
 * https://leetcode.com/problems/delete-greatest-value-in-each-row/
 */
class DeleteGreatestValueInEachRow : Problem {

    fun deleteGreatestValue(grid: Array<IntArray>): Int {
        var sum = 0
        for (array in grid) sortBySelection(array)

        for (j in grid[0].indices) {
            var max = 0
            for (i in grid.indices) {
                if (grid[i][j] > max) {
                    max = grid[i][j]
                }
            }
            sum += max
        }

        return sum
    }

    private fun sortBySelection(array: IntArray) {
        for (i in array.indices) {
            var smallest = i

            for (j in i + 1..array.lastIndex) {
                if (array[smallest] > array[j]) {
                    smallest = j
                }
            }
            val temp = array[i]
            array[i] = array[smallest]
            array[smallest] = temp
        }
    }

    override fun run() {
        println(deleteGreatestValue(arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 3, 1))))
        println(deleteGreatestValue(arrayOf(intArrayOf(10))))
        println(deleteGreatestValue(arrayOf(intArrayOf(10), intArrayOf(11))))
    }

}
