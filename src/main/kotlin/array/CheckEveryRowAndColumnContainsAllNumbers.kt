package array

import Problem


/**
 * https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/
 */
class CheckEveryRowAndColumnContainsAllNumbers : Problem {

    fun checkValid(matrix: Array<IntArray>): Boolean {
        matrix.forEach {
            val s = hashSetOf<Int>()
            it.forEach { if (!s.add(it)) return false }
        }
        for (i in matrix.indices) {
            val s = hashSetOf<Int>()
            matrix.forEach { if (!s.add(it[i])) return false }
        }
        return true
    }

    // n/2*(first + last)

    override fun run() {

    }

}
