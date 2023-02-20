package slidingwindow

import Problem

/**
 * https://leetcode.com/problems/sliding-window-maximum/
 */
class SlidingWindowMax : Problem {

    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val ans = mutableListOf<Int>()
        val queue = ArrayDeque<Int>()
        var max = findMaxIndex(nums, 0, k - 1)
        ans.add(nums[max])

        for (i in 0 until k) {
            queue.add(i)
        }

        for (i in k..nums.lastIndex) {
            val first = queue.removeFirst()

            max = if (first == max) {
                findMaxIndex(nums, i - k + 1, i)
            } else {
                if (nums[i] >= nums[max]) {
                    i
                } else {
                    max
                }
            }

            ans.add(nums[max])
            queue.add(i)
        }

        return ans.toIntArray()
    }

    private fun findMaxIndex(nums: IntArray, start: Int, end: Int): Int {
        var max = start

        for (i in start..end) {
            if (nums[i] > nums[max]) {
                max = i
            }
        }

        return max
    }

    override fun run() {
        // println(maxSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3).toList())
        // println(maxSlidingWindow(intArrayOf(1), 1).toList())
        // println(maxSlidingWindow(intArrayOf(1, -1), 1).toList())
        println(
            maxSlidingWindow(
                intArrayOf(-6, -10, -7, -1, -9, 9, -8, -4, 10, -5, 2, 9, 0, -7, 7, 4, -2, -10, 8, 7), 7
            ).toList()
        )
    }

}
