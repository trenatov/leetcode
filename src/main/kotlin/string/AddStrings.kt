package string

import Problem


/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
class AddStrings : Problem {

    fun addStrings(num1: String, num2: String): String {
        val maxLength = maxOf(num1.length, num2.length)
        val s1 = num1.padStart(maxLength, '0')
        val s2 = num2.padStart(maxLength, '0')

        var carry = 0
        val res = s1.zip(s2) { q, w -> (q - '0') to (w - '0') }
            .reversed()
            .map { (q, w) ->
                val s = q + w + carry
                carry = s / 10
                s % 10
            }
            .joinToString("")
            .reversed()
        return if (carry > 0) "1$res" else res
    }

    override fun run() {
    }

}
