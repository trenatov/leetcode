package greedy

import Problem


/**
 * https://leetcode.com/problems/largest-palindromic-number/description/
 */
class LongestPalindromicNumber : Problem {

    fun largestPalindromic(num: String): String {
        val digitCount = mutableMapOf<Char, Int>()

        for (c in num) {
            digitCount[c] = (digitCount[c] ?: 0) + 1
        }

        if (digitCount.size == 1 && digitCount.containsKey('0')) return "0"

        var palindromicDigits = digitCount
            .filter { it.value >= 2 }
            .keys
            .sortedByDescending { it }
            .fold("") { str, c -> str + c.toString().repeat(digitCount[c]!! / 2) }

        val highestOtherDigit = digitCount.filter { it.value % 2 == 1 }.keys.sortedByDescending { it }.firstOrNull()

        if (palindromicDigits.isNotEmpty() && palindromicDigits[0] == '0') palindromicDigits = ""

        return palindromicDigits + (highestOtherDigit ?: "") + palindromicDigits.reversed()

    }

    override fun run() {
        println(largestPalindromic("444947137"))
        println(largestPalindromic("00009"))
    }

}
