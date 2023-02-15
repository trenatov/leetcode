package math

import Problem


/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 */
class AddToArrayFormOfInt : Problem {

    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        val n = num.size
        var cur = k
        val ans: MutableList<Int> = mutableListOf()

        var i = n
        while (--i >= 0 || cur > 0) {
            if (i >= 0) cur += num[i]
            ans.add(cur % 10)
            cur /= 10
        }

        return ans.reversed()
    }


    override fun run() {
        println(addToArrayForm(intArrayOf(9, 9, 9, 9, 9, 9, 9, 9, 9, 9), 1))
    }

}
