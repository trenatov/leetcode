package array

import Problem


/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */
class RichestCustomer : Problem {

    fun maximumWealth(accounts: Array<IntArray>): Int {
        var richest = 0

        for (acc in accounts) {
            val wealth = acc.sum()
            if (wealth > richest) {
                richest = wealth
            }
        }
        return richest
    }

    override fun run() {
    }

}
