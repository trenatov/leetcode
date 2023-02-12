package string

import Problem


/**
 * https://leetcode.com/problems/shuffle-string/
 */
class ShuffleString : Problem {

    fun restoreString(s: String, indices: IntArray): String {
        val array = CharArray(indices.size)

        for (i in indices.indices) {
            array[indices[i]] = s[i]
        }

        return String(array)
    }

    override fun run() {
        println(restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)))
        println(restoreString("abc", intArrayOf(0,1,2)))
    }

}
