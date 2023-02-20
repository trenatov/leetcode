package slidingwindow

import Problem

/**
 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
 */
class SubstringDistinctChars : Problem {

    fun countGoodSubstrings(s: String): Int {
        if (s.length < 3) return 0

        var count = 0
        var prev = s.substring(0, 3)

        if (prev.toCharArray().toSet().size == prev.length) {
            count++
        }

        for (i in 3 until s.length) {
            val substring = StringBuilder(prev.substring(1, 3)).append(s[i]).toString()

            if (substring.toCharArray().toSet().size == substring.length) {
                count++
            }
            prev = substring
        }

        return count
    }

    override fun run() {
        println(countGoodSubstrings("xyzzaz"))
        println(countGoodSubstrings("aababcabc"))
    }

}
