package string

import Problem


/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
class MergeStringsAlternately : Problem {

    fun mergeAlternately(word1: String, word2: String): String {
        val builder = StringBuilder()
        val array1 = word1.toCharArray()
        val array2 = word2.toCharArray()

        for (i in word1.indices) {
            builder.append(array1[i])
            if (i <= array2.size - 1) {
                builder.append(array2[i])
            }
        }

        for (i in array1.size until array2.size) {
            builder.append(array2[i])
        }

        return builder.toString()
    }

    override fun run() {

    }

}
