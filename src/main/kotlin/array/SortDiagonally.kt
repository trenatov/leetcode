package array

import Problem


/**
 * https://leetcode.com/problems/sort-the-matrix-diagonally/
 */
class SortDiagonally : Problem {

    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {

        for (i in mat.indices) {
            for (j in 0 until mat[i].lastIndex) {
                sort(mat, i, j)
            }
        }

        return mat
    }

    private fun sort(mat: Array<IntArray>, i: Int, j: Int) {
        if (i >= mat.lastIndex || j >= mat[i].lastIndex) {
            return
        }

        do {
            var swapped = false
            var jCurrent = j

            for (iCurrent in i until mat.lastIndex) {
                if (jCurrent < mat[iCurrent].lastIndex && mat[iCurrent][jCurrent] > mat[iCurrent + 1][jCurrent + 1]) {
                    val temp = mat[iCurrent][jCurrent]
                    mat[iCurrent][jCurrent] = mat[iCurrent + 1][jCurrent + 1]
                    mat[iCurrent + 1][jCurrent + 1] = temp
                    swapped = true
                }
                jCurrent++
            }

        } while (swapped)
    }

    override fun run() {
//        val r = diagonalSort(arrayOf(intArrayOf(3, 3, 1, 1), intArrayOf(2, 2, 1, 2), intArrayOf(1, 1, 1, 2)))
        val r = diagonalSort(
            arrayOf(
                intArrayOf(11, 25, 66, 1, 69, 7),
                intArrayOf(23, 55, 17, 45, 15, 52),
                intArrayOf(75, 31, 36, 44, 58, 8),
                intArrayOf(22, 27, 33, 25, 68, 4),
                intArrayOf(84, 28, 14, 11, 5, 50)
            )
        )
        println(r)
    }

}
