package slidingwindow

import Problem

/**
 * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
 */
class NumberOfSubArraysAverageGreaterThanThreshHold : Problem {

    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        var count = 0
        var sum = 0

        for (i in 0 until k) {
            sum += arr[i]
        }

        if (sum / k >= threshold) count++

        for (i in k until arr.size) {
            sum += arr[i] - arr[i - k]
            if (sum / k >= threshold) count++
        }

        return count
    }

    override fun run() {

    }

}
