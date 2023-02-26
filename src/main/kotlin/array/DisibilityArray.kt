package array

import Problem


/**
 * https://leetcode.com/problems/find-the-divisibility-array-of-a-string/
 */
class DisibilityArray : Problem {

    fun divisibilityArray(word: String, m: Int): IntArray {
        val ans = IntArray(word.length)
        val prevRemainder = StringBuilder()

        for (i in word.indices) {
            val number = prevRemainder.append(word[i]).toString().toLong()
            if (number != 0L && number < m) {
                continue
            }

            val remainder = number % m
            prevRemainder.clear()

            if (remainder == 0L) {
                ans[i] = 1
            } else {
                prevRemainder.append(remainder)
            }
        }

        return ans
    }

    override fun run() {
        println(divisibilityArray("998244353", 3).toList())
        println(divisibilityArray("1010", 10).toList())
        println(divisibilityArray("406558257625557035913511825555416312823557329592354570049125", 5).toList())
    }

}
