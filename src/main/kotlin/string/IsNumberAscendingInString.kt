package string

import Problem


/**
 * https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/description/
 */
class IsNumberAscendingInString : Problem {

    fun areNumbersAscending(s: String): Boolean {
        var prev = Int.MIN_VALUE

        for (word in s.split(" ")) {
            val n = word.toIntOrNull()
            if (n != null) {
                if (prev >= n) {
                    return false
                } else {
                    prev = n
                }
            }
        }

        return true
    }

    override fun run() {

    }

}
