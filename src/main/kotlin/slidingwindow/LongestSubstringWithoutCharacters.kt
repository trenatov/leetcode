package slidingwindow

import Problem

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
class LongestSubstringWithoutCharacters : Problem {

    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        var prev = ""

        for (i in s.indices) {
            val new = StringBuilder(prev).append(s[i]).toString()

            if (new.toCharArray().toSet().size == new.length) {
                max = Math.max(max, new.length)
                prev = new
            } else {
                prev = new.substring(1, new.length)
            }
        }

        return max
    }

    override fun run() {
        println(lengthOfLongestSubstring("abcabcbb"))
        println(lengthOfLongestSubstring("bbbbb"))
        println(lengthOfLongestSubstring("pwwkew"))
    }

}
