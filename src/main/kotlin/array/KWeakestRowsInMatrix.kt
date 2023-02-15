package array

import Problem


/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
class KWeakestRowsInMatrix : Problem {

    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val answer = mutableMapOf<Int, Int>()

        for (i in mat.indices) {
            var soldiers = 0

            for (j in mat[i].indices) {
                if (mat[i][j] == 1) soldiers++
            }

            answer[i] = soldiers
        }

        return answer.toList().sortedBy { it.second }.take(k).map { it.first }.toIntArray()
    }

    override fun run() {

    }

}
