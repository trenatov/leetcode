package string

import Problem


/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
class FindAllAnagramsInString : Problem {

    fun findAnagrams(s: String, p: String): List<Int> {
        val sortedP = p.toCharArray().sorted().toCharArray()
        val answer = mutableListOf<Int>()

        for (i in 0..s.length - p.length) {
            val substring = s.substring(i, i + p.length)
            val sortedSubstring = substring.toCharArray().sorted().toCharArray()

            if (sortedP.contentEquals(sortedSubstring)) {
                answer.add(i)
            }
        }

        return answer
    }

    override fun run() {
        println(findAnagrams("cbaebabacd", "abc"))
        println(findAnagrams("abab", "ab"))
    }

}
