package math

import Problem


/**
 * https://leetcode.com/problems/ugly-number/
 */
class UglyNumber : Problem {

    fun isUgly(n: Int): Boolean {
        if (n <= 0) {
            return false
        }

        var s = n

        for (factor in intArrayOf(2, 3, 5)) {
            s = keepDividingWhenDivisible(s, factor)
        }

        return s == 1
    }

    private fun keepDividingWhenDivisible(dividend: Int, divisor: Int): Int {
        var dividend = dividend
        while (dividend % divisor == 0) {
            dividend /= divisor
        }
        return dividend
    }


    override fun run() {

    }

}
