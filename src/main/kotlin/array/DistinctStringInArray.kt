package array

import Problem


/**
 * https://leetcode.com/problems/kth-distinct-string-in-an-array/
 */
class DistinctStringInArray : Problem {

    fun kthDistinct(arr: Array<String>, k: Int): String {
        var left = k

        for (i in arr.indices) {

            if (isDistinct(arr, i)) {
                left--
            }

            if (left == 0) {
                return arr[i]
            }
        }

        return ""
    }

    private fun isDistinct(arr: Array<String>, i: Int): Boolean {
        for (j in 0..arr.lastIndex) {
            if (i != j && arr[i] == arr[j]) return false
        }

        return true
    }

    override fun run() {
        println(kthDistinct(arrayOf("d", "b", "c", "b", "c", "a"), 2))
    }

}
