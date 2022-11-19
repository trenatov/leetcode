package math

import Problem

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
class FibonacciNumber : Problem {

    fun fib(n: Int): Int {
        if (n == 0) return 0
        val arr = Array(n + 1) {0}
        arr[0] = 0
        arr[1] = 1

        for (i in 2..n) {
            arr[i] = arr[i - 1] + arr[i - 2]
        }

        return arr[n]
    }


    override fun run() {

    }

}
