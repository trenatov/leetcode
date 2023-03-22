package greedy

import Problem


/**
 * https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/
 */
class Typewriter : Problem {

    fun minTimeToType(word: String): Int {
        var prev = 'a'
        var sum = 0

        for (c in word) {
            sum += Math.min(Math.abs(prev - c), 26 - Math.abs(c - prev))
            prev = c
            sum++
        }

        return sum
    }

    override fun run() {
        println(minTimeToType("abc"))
        println(minTimeToType("bza"))
        println(minTimeToType("zjpc"))
    }

}
