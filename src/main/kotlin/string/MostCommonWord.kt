package string

import Problem


/**
 * https://leetcode.com/problems/most-common-word/
 */
class MostCommonWord : Problem {

    fun mostCommonWord(p: String, banned: Array<String>): String {
        val words = p.split(" ").map {
            it.filter { w -> w.isLetter() }
        }
        val set = banned.toSet()
        val map = mutableMapOf<String, Int>()

        for (word in words) {
            val lower = word.toLowerCase()
            if (!set.contains(lower)) {
                map[lower] = map.getOrDefault(lower, 0) + 1
            }
        }

        return map.maxBy { it.value }.key
    }

    override fun run() {
        // println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit")))
       // println(mostCommonWord("a.", arrayOf()))
        println(mostCommonWord("a, a, a, a, b,b,b,c, c", arrayOf("a")))
    }

}
