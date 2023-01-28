package sort.insertion

import Problem

/**
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 */
class CanMakeArithmeticProgression : Problem {

    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        insertionSort(arr)

        val diff = arr[1] - arr[0]
        for (i in 1 until arr.size - 1) {
            if (arr[i + 1] - arr[i] != diff) return false
        }
        return true
    }

    fun insertionSort(array: IntArray) {

        for (i in 0 until array.size - 1) {
            var current = i
            var nextIndex = i + 1
            val next = array[nextIndex]

            while (current >= 0 && array[current] > next) {
                array[nextIndex] = array[current]
                array[current] = next
                current--
                nextIndex--
            }
        }

    }

    override fun run() {
        println(canMakeArithmeticProgression(intArrayOf(3, 5, 1)))
        println(canMakeArithmeticProgression(intArrayOf(1, 2, 4)))
        println(canMakeArithmeticProgression(intArrayOf(1, 2)))
    }

}
