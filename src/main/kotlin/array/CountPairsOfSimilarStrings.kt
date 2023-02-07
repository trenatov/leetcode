package array

import Problem


/**
 * https://leetcode.com/problems/count-pairs-of-similar-strings/description/
 */
class CountPairsOfSimilarStrings : Problem {

    fun similarPairs(words: Array<String>): Int {
        var count = 0

        for (i in words.indices) {
            for (j in i + 1..words.lastIndex) {
                val word = words[i].toCharArray().distinct().sorted().toCharArray()
                val nextWord = words[j].toCharArray().distinct().sorted().toCharArray()

                if (word.contentEquals(nextWord)) count++
            }
        }

        return count
    }

    override fun run() {
    }

}
