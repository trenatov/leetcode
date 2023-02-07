package array

import Problem


/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */
class CountTheNumberOfConsistentStrings : Problem {

    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var count = 0
        for (word in words) {
            if (consistAll(allowed, word)) count++
        }
        return count
    }

    private fun consistAll(allowed: String, word: String): Boolean {
        for (c in word) {
            if (!allowed.contains(c)) {
                return false
            }
        }
        return true
    }

    override fun run() {

    }

}
