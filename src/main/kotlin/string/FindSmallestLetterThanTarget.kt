package string

import Problem


/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */
class FindSmallestLetterThanTarget : Problem {

    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var list = letters.toMutableList().apply {
            add(target)
        }.distinct().toMutableList()
        list.sort()

        for (i in list.indices) {
            if (list[i] == target && i < list.lastIndex) {
                return list[i + 1]
            }
        }

        return target
    }

    override fun run() {
    }

}
