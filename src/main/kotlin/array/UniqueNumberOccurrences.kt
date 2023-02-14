package array

import Problem


/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
class UniqueNumberOccurrences : Problem {

    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()

        for (n in arr) {
            if (map[n] == null) {
                map[n] = 1
            } else {
                val current = map[n]!!
                map[n] = current + 1
            }
        }
        val size = map.size

        return map.values.distinct().size == size
    }

    override fun run() {
        intArrayOf(1, 2)
    }

}
