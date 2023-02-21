package array

import Problem


/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 */
class ValidPalindromeTwo : Problem {

    fun validPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i <= j) {
            if (s[i] == s[j]) {
                i++
                j--
            } else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1)
        }
        return true
    }

    private fun isPalindrome(s: String, i: Int, j: Int): Boolean {
        var i = i
        var j = j
        while (i <= j) {
            if (s[i] == s[j]) {
                i++
                j--
            } else return false
        }
        return true
    }

    override fun run() {

    }

}
