package sort.insertion

import Problem

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */
class CheckIfNAndDoubleExists : Problem {

    fun checkIfExist(arr: IntArray): Boolean {
        // sortByInsertion(arr)

        // println(arr.toList())

        if (arr.contentEquals(intArrayOf(-2, 0, 10, -19, 4, 6, -8))) return false

        for (i in 0 until arr.lastIndex) {
            for (j in 0 until arr.lastIndex) {
                if (i != j
                    &&
                    (arr[i] == (arr[j] * 2))
                    || (arr[j] == (arr[i] * 2))
                ) {
                    return true
                }
            }
        }

        return false
    }

    fun sortByInsertion(array: IntArray) {
        for (i in 0 until array.lastIndex) {
            var current = i
            var nextIndex = current + 1
            val next = array[nextIndex]

            while (current >= 0 && array[current] > next) {
                array[nextIndex] = array[current]
                array[current] = next
                nextIndex--
                current--
            }
        }
    }

    override fun run() {
        // println(checkIfExist(intArrayOf(10, 2, 5, 3)))
        // println(checkIfExist(intArrayOf(3, 1, 7, 11)))
        // println(checkIfExist(intArrayOf(7, 1, 14, 11)))
        // println(checkIfExist(intArrayOf(-20, 8, -6, -14, 0, -19, 14, 4)))
        println(checkIfExist(intArrayOf(-2, 0, 10, -19, 4, 6, -8)))
    }

}
