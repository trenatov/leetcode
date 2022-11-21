package array

import Problem


/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 */
class LuckyNumbersInArray : Problem {

    fun findLucky(arr: IntArray): Int {
        var luckyNumber = -1

        for (n in arr) {
            if (luckyNumber < n && isLucky(arr, n)) {
                luckyNumber = n
            }
        }
        return luckyNumber
    }

    private fun isLucky(array: IntArray, n: Int): Boolean {
        var count = 0

        for (v in array) {
            if (v == n) count++
        }

        return count == n
    }

    override fun run() {
        println(findLucky(intArrayOf(2, 2, 3, 4)))
        println(findLucky(intArrayOf(1, 2, 2, 3, 3, 3)))
        println(findLucky(intArrayOf(2, 2, 2, 3, 3)))
    }

}
