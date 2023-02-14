package greedy

import Problem


/**
 * https://leetcode.com/problems/longest-happy-string/description/
 */
class LongestHappyString : Problem {

    fun longestDiverseString(a: Int, b: Int, c: Int): String {
        return generate(a, b, c, "a", "b", "c");
    }

    private fun generate(a: Int, b: Int, c: Int, aa: String, bb: String, cc: String): String {
        if (a < b) return generate(b, a, c, bb, aa, cc)
        if (b < c) return generate(a, c, b, aa, cc, bb)
        if (b == 0) return aa.repeat(Math.min(2, a))
        val useA = Math.min(2, a)
        val useB = if (a - useA >= b) 1 else 0
        return aa.repeat(useA) + bb.repeat(useB) +
                generate(a - useA, b - useB, c, aa, bb, cc)
    }

    override fun run() {
        println(longestDiverseString(1, 1, 7))
        println(longestDiverseString(7, 1, 0))
        println(longestDiverseString(0, 8, 11))
    }

}
