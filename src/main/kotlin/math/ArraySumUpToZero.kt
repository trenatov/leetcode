package math

import Problem


/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
class ArraySumUpToZero : Problem {

    fun sumZero(n: Int): IntArray {
        val array = IntArray(n)
        for (i in 0 until n) array[i] = i * 2 - n + 1
        return array
    }

    override fun run() {

    }

}
