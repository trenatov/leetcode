package array

import Problem


/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 */
class LuckyNumbersInMatrix : Problem {

    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val nums = mutableListOf<Int>()
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {

                if (isMinInRow(j, matrix[i]) && isMaxInColumn(i, j, matrix)) {
                    nums.add(matrix[i][j])
                }
            }
        }

        return nums
    }

    private fun isMaxInColumn(i: Int, j: Int, matrix: Array<IntArray>): Boolean {
        for (c in matrix.indices) {
            if (c != i && matrix[c][j] > matrix[i][j]) {
                return false
            }
        }

        return true
    }

    private fun isMinInRow(index: Int, array: IntArray): Boolean {
        for (i in array.indices) {
            if (i != index && array[i] < array[index]) {
                return false
            }
        }

        return true
    }

    override fun run() {
        println(luckyNumbers(arrayOf(intArrayOf(3, 7, 8), intArrayOf(9, 11, 13), intArrayOf(15, 16, 17))).toList())
    }

}
