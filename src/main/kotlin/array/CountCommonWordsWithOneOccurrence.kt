package array

import Problem


/**
 * https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
 */
class CountCommonWordsWithOneOccurrence : Problem {

    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        var count = 0

        for (i in words1) {
            if (isOnlyOnceAppeared(i, words2) && isOnlyOnceAppeared(i, words1)) count++
        }
        return count
    }

    private fun isOnlyOnceAppeared(w: String, words2: Array<String>): Boolean {
        var count = 0
        for (w2 in words2) {
            if (count > 1) return false
            if (w2 == w) count++
        }

        return count == 1
    }

    override fun run() {
    }

}
