package string

import Problem


/**
 * https://leetcode.com/problems/first-letter-to-appear-twice/
 */
class FirstLetterAppearsTwice : Problem {

    fun repeatedCharacter(s: String): Char {
        val set = HashSet<Any?>()
        for (c in s.toCharArray()) if (!set.add(c)) return c

        return '-'
    }

    override fun run() {
    }

}
