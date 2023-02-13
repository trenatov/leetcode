package array

import Problem


/**
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
class SumOfAllAddLengthSubarrays : Problem {

    fun sumOddLengthSubarrays(arr: IntArray): Int {
        val n = arr.size
        var answer = 0

        for (left in 0 until n) {
            for (right in left until n) {
                if ((right - left + 1) % 2 == 1) {
                    var currentSum = 0
                    for (index in left until right + 1) {
                        currentSum += arr[index]
                    }
                    answer += currentSum
                }
            }
        }
        return answer
    }

    override fun run() {
        println(sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)))
        println(sumOddLengthSubarrays(intArrayOf(1, 2)))
        println(sumOddLengthSubarrays(intArrayOf(10, 11, 12)))
    }

}
