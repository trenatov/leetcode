package array

import Problem


/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
class MaxNumberOfWords : Problem {

    fun mostWordsFound(sentences: Array<String>): Int {
        val list =  sentences.map { it.split(" ") }.map { it.size }

        var max = 0
        for (i in list) {
            if (i>max){
                max = i
            }
        }

        return max
    }

    override fun run() {
    }

}
