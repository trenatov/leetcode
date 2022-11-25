package math

import Problem


/**
 * https://leetcode.com/problems/valid-perfect-square/
 */
class PerfectSquare : Problem {

    fun isPerfectSquare(num: Int): Boolean {
        for (n in 1..num) {
            if (n * n == num) {
                return true
            } else if (n * n > num) return false
        }
        return false
    }


    override fun run() {

    }

}
