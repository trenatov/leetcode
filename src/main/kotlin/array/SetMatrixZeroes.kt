package array

import Problem


/**
 * https://leetcode.com/problems/set-matrix-zeroes/
 */
class SetMatrixZeroes : Problem {

    fun setZeroes(matrix: Array<IntArray>): Unit {
        var i = 0
        var j = 0

        val pairs = mutableListOf<Pair<Int, Int>>()

        while (i < matrix.size && j < matrix[i].size) {
            if (matrix[i][j] == 0) {
                pairs.add(Pair(i, j))
            }

            j++

            if (j > matrix[i].lastIndex) {
                j = 0
                i++
            }
        }

        pairs.forEach { makeAllZeros(matrix, it.first, it.second) }
    }

    private fun makeAllZeros(matrix: Array<IntArray>, index: Int, jindex: Int) {
        for (i in matrix[index].indices) {
            matrix[index][i] = 0
        }
        for (i in matrix.indices) {
            matrix[i][jindex] = 0
        }
    }

    override fun run() {
        val array = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))
        setZeroes(array)

        println(array)
    }

}
