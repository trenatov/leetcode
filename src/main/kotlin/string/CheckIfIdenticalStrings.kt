package string

import Problem


/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 */
class CheckIfIdenticalStrings : Problem {

    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        val sb1 = StringBuilder()
        val sb2 = StringBuilder()

        for (i in word1.indices) {
            sb1.append(word1[i])
        }
        for (i in word2.indices) {
            sb2.append(word2[i])
        }
        return sb1.toString() == sb2.toString()
    }

    override fun run() {

    }

}
