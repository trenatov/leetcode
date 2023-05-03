package dynamic

import Problem


/**
 * https://leetcode.com/problems/palindromic-substrings/
 */
class PalindromicSubstrings : Problem {

    fun countSubstrings(s: String): Int {
        var count = 0
        for (i in s.indices) {
            for (j in i..s.lastIndex) {
                if (isPol(s, i, j)) count++
            }
        }
        return count
    }

    private fun isPol(s: String, from: Int, to: Int): Boolean {
        var i = from
        var j = to

        while (i < j) {
            if (s[i] != s[j]) return false
            i++
            j--
        }

        return true
    }

    override fun run() {
        println(countSubstrings("abc"))
    }

}
