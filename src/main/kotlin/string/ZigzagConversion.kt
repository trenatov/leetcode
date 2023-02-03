package string

import Problem


/**
 * https://leetcode.com/problems/zigzag-conversion/
 */
class ZigzagConversion : Problem {

    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }

        val answer = StringBuilder()
        val n: Int = s.length
        val diff = 2 * (numRows - 1)
        var diagonalDiff = diff
        var secondIndex: Int
        var index: Int
        for (i in 0 until numRows) {
            index = i
            while (index < n) {
                answer.append(s[index])
                if (i != 0 && i != numRows - 1) {
                    diagonalDiff = diff - 2 * i
                    secondIndex = index + diagonalDiff
                    if (secondIndex < n) {
                        answer.append(s[secondIndex])
                    }
                }
                index += diff
            }
        }

        return answer.toString()
    }

    override fun run() {
    }

}
