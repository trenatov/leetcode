package string

import Problem

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
class FirstUniqueCharacter : Problem {

    fun firstUniqChar(s: String): Int {
        val array = s.toCharArray()
        for (index in array.indices) {
            if (isUnique(array, index)) return index
        }
        return -1
    }

    private fun isUnique(array: CharArray, index: Int): Boolean {
        for (i in array.indices) {
            if (i != index && array[index] == array[i]) return false
        }

        return true
    }

    override fun run() {
        println(firstUniqChar("aabb"))
    }

}
