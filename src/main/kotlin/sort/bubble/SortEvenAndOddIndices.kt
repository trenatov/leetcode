package sort.bubble

import Problem


/**
 * https://leetcode.com/problems/sort-even-and-odd-indices-independently/
 */
class SortEvenAndOddIndices : Problem {

    fun sortEvenOdd(nums: IntArray): IntArray {
        do {
            var swapped = false

            for (i in 0..nums.size - 2 step 2) {
                val current = nums[i]
                val nextIndex = i + 2

                if (nextIndex >= nums.size) continue

                val next = nums[nextIndex]

                if (next < current) {
                    nums[i] = next
                    nums[nextIndex] = current

                    swapped = true
                }
            }
        } while (swapped)

        do {
            var swapped = false

            for (i in 1..nums.size - 2 step 2) {
                val current = nums[i]
                val nextIndex = i + 2

                if (nextIndex >= nums.size) continue

                val next = nums[nextIndex]

                if (next > current) {
                    nums[i] = next
                    nums[nextIndex] = current

                    swapped = true
                }
            }
        } while (swapped)

        return nums
    }

    override fun run() {
        println(sortEvenOdd(intArrayOf(4, 1, 2, 3)).toList())
        println(sortEvenOdd(intArrayOf(2, 1)).toList())
        println(sortEvenOdd(intArrayOf(1)).toList())
    }

}
