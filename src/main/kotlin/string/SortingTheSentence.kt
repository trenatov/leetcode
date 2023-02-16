package string

import Problem


/**
 * https://leetcode.com/problems/sorting-the-sentence/
 */
class SortingTheSentence : Problem {

    fun sortSentence(s: String): String {
        val builder = StringBuilder()
        val map = s.split(" ").map {
            val index = it[it.length - 1] - '0'
            val new = it.replace(index.toString(), "")
            index to new
        }.toMap().toSortedMap()

        map.values.forEachIndexed { index, c ->
            if (index == map.size - 1) {
                builder.append(c)
            } else {
                builder.append("$c ")
            }
        }
        return builder.toString()
    }

    override fun run() {
    }

}
