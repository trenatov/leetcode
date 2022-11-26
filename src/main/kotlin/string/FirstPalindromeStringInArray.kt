package string

import Problem

/**
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 */
class FirstPalindromeStringInArray : Problem {

    fun firstPalindrome(words: Array<String>): String {
        for (word in words) {
            if (isPalindrome(word)) return word
        }
        return ""
    }

    private fun isPalindrome(word: String): Boolean {
        val array = word.toCharArray()
        val size = array.size - 1

        for (i in 0..size / 2) {
            val start = array[i]
            val end = array[size - i]

            if (start != end) return false
        }

        return true
    }

    override fun run() {

    }

}
