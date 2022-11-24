package math

import Problem


/**
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */
class FinalValueOfVariableAfterPerformingOperations : Problem {

    fun finalValueAfterOperations(operations: Array<String>): Int {
        var result = 0
        for (operation in operations) {
            when (operation) {
                "--X" -> --result
                "++X" -> ++result
                "X++" -> result++
                "X--" -> result--
            }
        }

        return result
    }

    override fun run() {

    }

}
